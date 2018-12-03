import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Taschenrechner objektorientiert erstellen
		 *
		 * Wir brauchen dazu:
		 * 	* Einen Scanner, um Eingaben anzunehmen.
		 * 	* Ein Objekt von unserer Klasse Rechner
		 * 	* Eine Schleife, in der unser Programm ausgef�hrt wird
		 * 	* Verschieden Methoden in Rechner um...
		 * 		... zu addieren
		 * 		... zu subtrathieren
		 * 		... zu multiplizieren
		 * 		...	zu dividieren
		 * 		... den Rest einer Divisoin zu bestimmen (Modulo)
		 * 	* Diese Methoden sollen einen R�ckgabewert besitzen
		 * 	* Dort soll das Ergebnis zur�ckgegeben werden
		 * 	- Wir wollen das Ergebnis auf der Konsole ausgeben
		 * 		4 + 9 = 13
		 * 		8 * 8 = 64 
		 */
		
		// Wir erstellen ein Objekt derScanner der Klasse Scanner
		Scanner derScanner = new Scanner(System.in);
		
		// Wir erstellen ein Objekt derRechner der Klasse Rechner
		Rechner derRechner = new Rechner();
		
		// Begr��ungstext
		System.out.println("Willkommen beim SuperDuperRechner V1.0");
		System.out.println();
		
		
		// Eine Schleife, in der unser Programm ausgef�hrt wird.
		// Wir wollen eine Dauerschleife		
		while(true) {
			// Alles hier drin, wird solange ausgef�hrt, 
			// bis wir das Programm beenden
			
			// Frage, welche Rechenoperation ausgef�hrt werden soll
			System.out.println("Welche Rechenoperation m�chtest Du ausf�hren?");
			System.out.println(" + Addition");
			System.out.println(" - Subtraktion");
			System.out.println(" * Multiplikation");
			System.out.println(" / Division");
			System.out.println(" % Rest Bestimmung");
			
			// Lese Operator ein
			System.out.print("Operation: ");
			String operator = derScanner.next();
			
			// Definiere Eingabe1 und 2
			double eingabe1, eingabe2;
			
			// Rufe entsprechende Methode auf 
			switch(operator) {
			// Rechenoperationen, die 2 Eingaben ben�tigen
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":
				// Lese erste Zahl ein
				System.out.print("Zahl 1: ");
				eingabe1 = derScanner.nextDouble();
				// Lese zweite Zahl
				System.out.print("Zahl 2: ");
				eingabe2 = derScanner.nextDouble();
				
				System.out.print("Ergebnis: ");
				
				switch(operator) {
				// +
				case "+":
					System.out.println(derRechner.addiere(eingabe1, eingabe2));
					break;
				// -
				case "-":
					System.out.println(derRechner.subtrahiere(eingabe1, eingabe2));
					break;
				// *
				case "*":
					System.out.println(derRechner.multipliziere(eingabe1, eingabe2));
					break;
				// /
				case "/":
					System.out.println(derRechner.dividiere(eingabe1, eingabe2));
					break;
				// %
				case "%":
					System.out.println(derRechner.modulo(eingabe1, eingabe2));
					break;				
				}
				
				break;
			
			// Rechenoperationen, die eine Eingabe ben�tigen	
			case "!":
			case "*2":
			case "^2":
				// Lese erste Zahl ein
				System.out.print("Zahl 1: ");
				eingabe1 = derScanner.nextDouble();
				
				System.out.print("Ergebnis: ");
				
				switch(operator) {
				// Verdoppeln
				case "*2":
					System.out.println(derRechner.mal2(eingabe1));
					break;
				// Hoch 2
				case "^2":
					System.out.println(derRechner.hoch2(eingabe1));
					break;
				// Fakult�t
				case "!":
					System.out.println(derRechner.fakultaet(eingabe1));
					break;
				}
				break;
				
			// Falsches Zeichen eingeben
			default:
				System.out.print("Operator nicht definiert!");
				break;
			}
			
			
			/*
			 * Wir wollen: 
			 * 	* Einen Begr��ungstext ausgeben.
			 * 	* Fragen, welche Rechenoperation ausgef�hrt werden soll?
			 * 	* und rufen dann die entsprechende Methode auf
			 * 	* Eingaben �ber den Scanner annehmen.
			 * 	* Die Eingaben �bergeben
			 * 	* Das Ergebnis auf der Konsole ausgeben.
			 * 	* Fragen, ob nochmal gerechnet werden m�chte, 
			 * 		wenn ja, Programm soll nochmal ausgef�hrt werden.
			 * 		wernn nein, Programm soll beendet werden.
			 */
			
			// Leerzeile nach dem Rechner
			System.out.println();
			
			// Fragen, ob beendet werden soll
			System.out.println("M�chtest du nochmals rechnen?");
			System.out.println("(Any Key) = Ja     (N) = Nein");
			
			if(derScanner.next().toLowerCase().charAt(0) == 'n') {
				break;
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println("Programm beendet.");
	}

}
