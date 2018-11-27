
public class Einfuehrung {

	public static void main(String[] args) {
		// Was sind Variablen?
		// Variablen sind Speicherbausteine
		// Jede Variable ist von einem bestimmten Typ
		// Es gibt ganze Zahlen, Kommazahlen, Worte, Buchstaben, Wahrheitswerte
		// Typ Namen

		// Ganze Zahl
		int meineGanzeZahl = 4;

		// Komma Zahl
		double meineKommaZahl = 7.0;

		System.out.print("Meine ganze Zahl lautet "); // "" gibt immer genau das aus, was in den Anf�hrungszeichen steht
		System.out.println(meineGanzeZahl); // Gibt den Wert von meineGanzeZahl aus

		System.out.println("Meine ganze Zahl lautet " + meineGanzeZahl); // Selbiges wie weiter oben

		double zahl2 = meineKommaZahl / 2; // Da meineKommaZahl vom Typ double ist, muss .0 nicht erg�nzt werden
		System.out.println(zahl2);

		double zahl3 = meineGanzeZahl / 8.0; // Wichitg! 2.0 Da sonst eine int Zahl entsteht und der Kommaanteil
												// abgetrennt w�rde
		System.out.println(zahl3);

		// Worte und Texte
		// Verkettung von Zeichen
		String meinWort = "Hallo"; // Einzelne Worte
		String meinText = "Java ist spannend :D"; // Oder ganze Texte

		// sysout + Strg + Leertaste gibt System.out.println();

		System.out.println(meinWort);
		System.out.println(meinText);

		// Einzelne Zeichen
		char meinBuchstabe = 'c';
		System.out.println(meinBuchstabe);

		// Wahrheitstypen
		boolean meineWahrheit = false; // K�nnen nur true (wahr) oder false (falsch) annehmen
		System.out.println(meineWahrheit);

		// Verzweigungen
		if (meineWahrheit) {
			System.out.println("If wurde ausgef�ht!");
		} else {
			System.out.println("Else wurde ausgef�hrt!");
		}

		// Pr�fe ob meineGanzeZahl gr��er als 10 ist. Wenn ja, gebe "Zahl ist gr��er als
		// 10" aus, wenn nein, gebe "Zahl ist kleiner als 10" aus
		if (meineGanzeZahl > 10) {
			System.out.println("Zahl ist gr��er als 10.");
		} else { // == �berpr�fung = Zuweisung
			if (meineGanzeZahl == 10) {
				System.out.println("Zahl ist gleich 10.");
			} else {
				if (meineGanzeZahl < 10) {
					System.out.println("Zahl ist kleiner 10.");
				} else {
					System.out.println("Zahl ist nicht definiert.");
				}
			}
		}
		
		// Bei Bereichen, If, Else if und Else
		if (meineGanzeZahl > 10) {
			System.out.println("Zahl ist gr��er als 10.");
		} else if (meineGanzeZahl == 10) {
			System.out.println("Zahl ist gleich 10.");
		} else if (meineGanzeZahl < 10) {
			System.out.println("Zahl ist kleiner 10.");
		} else {
			System.out.println("Zahl ist nicht definiert.");
		}
		
		// Bei expliziten Werten switch case
		switch(meineGanzeZahl) {
		case 8:
		case 9: 
			System.out.println("Nur eine 8");
			break;
		case 10:
			System.out.println("Bei einer 10...");
			// break;		// Wenn nicht gesetzt, wird der n�chste Fall ebenfalls ausgef�hrt ...	
		case 5: 
			System.out.println("... gibt es eine 5 dazu");
			break;			// ... bis zum n�chsten break
		default: 			// Wie "else" bei if-else	=> Wenn kein anderer Fall zutrifft, dann default
			System.out.println("Kein Fall trifft zu!");
		}

		// Schleifen
		// For Schleife						1. Laufvariable + Ausgangswert		2. Bedingung	3. Anweisung
		for(int i = 10; i>= 1; i-=5) {		// ++ Inkrekment: Erh�he um 1 			-- Dekrement: Erniedrige um 1
			System.out.println(i);
		}
		
		// Gebe 5 mal "Hallo Welt!" in einer Zeile mit Leerzeichen dazwischen aus
		// Hallo Welt! Hallo Welt! Hallo Welt! Hallo Welt! Hallo Welt!
		for(int i = 4; i >= 0; i--) {
			System.out.print("Hallo Welt! ");
		}
			
		System.out.println();
			
		// Fakult�t => multipliziert alle nat�rlichen Zahlen von 1 - n miteinander. 
		// 5!=5*4*3*2(*1)
		// 10!=10*9*8*7*6*5*4*3*2*1

		int ende = 5;
		int f = 2;
		
		// 3! = 3*2*1
		
		for(int i = 3; i<= ende; i++) {
			f *= i; 	// f = f*i;
		}
		
		System.out.println("Fakul�t von " + ende + " ist " + f);
		
		
		// While Schleife
		int i = 2;
		int j = 3;
		
		String a = "Hallo";
		String b = "Welt";
		
		while(a =="Hallo" && b=="Welt") {
			System.out.println("Ein einfaches & geht auch");
		}
		
		while(i <= 5 && j == 4) {			// 	|| oder			&& und
											//	&& Logische Pr�fung von und	& Bitweise Und-Verkn�pfung (1010 & 1100 = 1000)
											// 	|| Logische Pr�fung von oder	| Bitweise Oder-Verkn�pfung (1010 | 1100 = 1110)
											//	Bei Schleifen nehmen wir die logische Pr�fung (&& ||)
											// 	== Abfrage		= Zuweisung
			System.out.println("Test");
			i++;
		}
		
		// Do While Schleife
		i = 5;
		do {
			System.out.println("Do while f�hrt mindestens einmal aus!");
			i--;
		} while(i >= 2);
		
		System.out.println("Programm ist beendet!");
		
		//
		//
		//
	}

}
