
public class Steuerung {
	// Attribute
	private Oberflaeche dieOberflaeche = new Oberflaeche();
	private Spieler[] spieler = new Spieler[2];
	private Spielfeld dasSpielfeld = new Spielfeld();
	private int zustand = 0;
	private int aktSpieler = 0;
	private int feldBreite; 
	private int feldHoehe;

	// Konstruktor
	public Steuerung() {
		// Begr��ungstext
		dieOberflaeche.gebeText("TicTacToe V1.0", true);
		spielerEinlesen();
		
		feldBreite = dasSpielfeld.gebeBreite();
		feldHoehe = dasSpielfeld.gebeHoehe();
	}

	// Methoden
	public void start() {
		// Hier kommt unser Programmablauf rein

		// Zustandsautomat
		while (zustand < 5) {
			switch (zustand) {
			// Spiel l�uft
			case 0:
				spielfeldAusgeben();
				feldSetzen();

				// Spieler wechseln
				// Entweder if else oder tern�rer Operator
				spielerWechseln();

				// aktSpieler == 1
				// aktSpieler = 0;
				// aktSpieler != 1
				// aktSpieler = 1;

//				if (aktSpieler == 1) {
//					aktSpieler = 0;
//				} else {
//					aktSpieler = 1;
//				}

				break;

			// Spieler 1 gewinnt
			case 1:
				// Name von Spieler 1 und " hat gewonnen!" ausgeben
				dieOberflaeche.gebeText(spieler[0].getName() + " hat gewonnen!", true);
				zustand = 4;
				break;

			// Spieler 2 gewinnt
			case 2:
				// Name von Spieler 1 und " hat gewonnen!" ausgeben
				dieOberflaeche.gebeText(spieler[1].getName() + " hat gewonnen!", true);
				zustand = 4;
				break;

			// Unentschieden
			case 3:
				// "Das Spiel geht unentschieden aus!" ausgeben
				dieOberflaeche.gebeText("Das Spiel geht unentschieden aus!", true);
				zustand = 4;
				break;

			// Frage nach Wiederholung
			case 4:
				// "Wollt ihr nochmal spielen?"
				// Wenn ja, dann Spiel zur�cksetzen
				// Wenn nein, dann Spiel beenden
				dieOberflaeche.gebeText("Wollt ihr nochmal spielen? (J/N) ", false);

				if (Character.toLowerCase(dieOberflaeche.leseZeichen()) == 'j') {
					// Wenn ja, Spielfeld zur�cksetzen und Zustand auf 0
					dasSpielfeld.setzeZurueck();
					zustand = 0;
				} else {
					// Wenn nein, Zustand auf 5, damit das Spiel beendet wird.
					zustand = 5;
				}

				break;

			}
		}
		dieOberflaeche.neueZeile(3);
		System.out.println("Spiel beendet");
	}

	private void feldSetzen() {
		// Aktuellen Spieler ausgeben
		dieOberflaeche.gebeText(spieler[aktSpieler].getName() + " ist an der Reihe!", true);
		
		int tempX, tempY;
		
		do {
		// X einlesen
		dieOberflaeche.gebeText("X: ", false);
		tempX = dieOberflaeche.leseZahl();
		
		// Y einlesen
		dieOberflaeche.gebeText("Y: ", false);
		tempY = dieOberflaeche.leseZahl();
		} while(tempX < 0 || tempX >= this.feldBreite ||
				tempY < 0 || tempY >= this.feldHoehe);
		
		// Wert bestimmen
		int wert = aktSpieler == 0 ? 1 : -1;
		
		// Pr�fen, ob das Feld frei ist
		if (dasSpielfeld.pruefeFeld(tempX, tempY) == true) {
			dasSpielfeld.setzeFeld(tempX, tempY, wert);
		}
		else {
			dieOberflaeche.gebeText("Feld ist bereits belegt!", true);
			spielerWechseln();
		}
	}

	private void spielfeldAusgeben() {
		dieOberflaeche.gebeSpielfeld(dasSpielfeld.getSpielfeld(), spieler[0].getSpielStein(),
				spieler[1].getSpielStein());
	}

	private void spielerEinlesen() {
		// Spieler 1 ausgeben
		dieOberflaeche.gebeText("Spieler 1", true);
		// Name und Zeichen einlesen
		dieOberflaeche.gebeText("Name: ", false);
		String tempString = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		char tempChar = dieOberflaeche.leseZeichen();

		// Objekt spieler[0] erstellen
		spieler[0] = new Spieler(tempString, tempChar);

		// Neue Zeile
		dieOberflaeche.neueZeile(1);

		// Spieler 2 ausgeben
		dieOberflaeche.gebeText("Spieler 2", true);
		// Name und Zeichen einlesen
		dieOberflaeche.gebeText("Name: ", false);
		tempString = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		tempChar = dieOberflaeche.leseZeichen();

		// Objekt spieler[1] erstellen
		spieler[1] = new Spieler(tempString, tempChar);

		// Neue Zeile
		dieOberflaeche.neueZeile(1);
	}

	private void spielerWechseln() {
		aktSpieler = (aktSpieler == 1) ? 0 : 1;
	}
}
