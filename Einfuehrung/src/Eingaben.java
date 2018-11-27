import java.util.Scanner;		// Import der Scanner Klasse

public class Eingaben {

	public static void main(String[] args) {
//		String meinText = "Beispiel Text";
//		System.out.println(meinText);
//		
		Scanner derScanner = new Scanner(System.in);		// Neues Objekt derScanner von Klasse Scanner
		
//		
//		// String meineEingabe = Eingabe von der Konsole übernehmen
//		System.out.print("Eingabe: ");
//		String meineEingabe = derScanner.nextLine();
//		// String Eingaben mit .nextLine();
//		// Scanner wartet auf Eingabe und Enter
//		System.out.println("Unsere Eingabe lautet: " + meineEingabe);
//		
//		System.out.print("Eingabe: ");
//		int meineZahl = derScanner.nextInt();
//		
//		// int Eingaben mit .nextInt();
//		System.out.println("Unsere Zahl lautet: " + meineZahl);
//		
//		// Eingabe annehmen als int Wert
//		// Quadrat bilden (mit sich selbst multiplizieren)
//		// "Die Quadratzahl von 4 ist 16" ausgeben
//		
//		System.out.println("Quadratzahlen");
//		System.out.print("Eingabe ");
//		int zahl = derScanner.nextInt();
//		System.out.println("Die Quadratzahl von " + zahl + " ist " + zahl*zahl);
//		
//		// Zwei ganze Zahlen annehmen, diese dann addieren und Ergebnis ausgeben
//		System.out.println("Addition");
//		System.out.print("Eingabe Zahl 1: ");
//		int zahl1 = derScanner.nextInt();
//		System.out.print("Eingabe Zahl 2: ");
//		int zahl2 = derScanner.nextInt();
//		System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1+zahl2));

		// Double Eingaben mit .nextDouble();
		// System.out.print("Kommazahlen einlesen: ");
		// double kommaZahl = derScanner.nextDouble();
		// In der Konsole müssen wir das Kommazeichen (,) verwenden, im Programmcode
		// einen Punkt (.)
		// System.out.println(kommaZahl);

		// Float Eingaben
//		float z1 = derScanner.nextFloat();
//		float z2 = derScanner.nextFloat();
//		System.out.println(z1/z2);

		// Char Eingaben
		// System.out.print("Zeichen einlesen: ");
		// char meinZeichen = derScanner.next().charAt(0);
		// System.out.println("Das Zeichen lautet " + meinZeichen);

		// Eingabe Zahl1, Auswahl Operator, Eingabe Zahl2, Ausgabe Ergebnis
		System.out.println("Rechner");

		double z1, z2, ergebnis;
		// Mehrere Variablen vom gleichen Datentyp können mit Komma getrennt deklariert
		// werden
		char operator;

		System.out.print("Zahl 1: ");
		z1 = derScanner.nextDouble();
		System.out.print("Operator: ");
		operator = derScanner.next().charAt(0);
		System.out.print("Zahl 2: ");
		z2 = derScanner.nextDouble();

		switch (operator) {
		case '+':
			ergebnis = z1 + z2;
			System.out.println(String.valueOf(z1) + " " + operator + " " + z2 + " = " + ergebnis);
			break;
		case '-':
			ergebnis = z1 - z2;
			System.out.println(z1 + " " + operator + " " + z2 + " = " + ergebnis);
			break;
		case '*':
			ergebnis = z1 * z2;
			System.out.println(z1 + " " + operator + " " + z2 + " = " + ergebnis);
			break;
		case '/':
			ergebnis = z1 / z2;
			System.out.println(z1 + " " + operator + " " + z2 + " = " + ergebnis);
			break;
		case '%':
			ergebnis = z1 % z2;
			System.out.println(z1 + " " + operator + " " + z2 + " = " + ergebnis);
			break;
		default:
			System.out.println("Operator nicht definiert");
		}
		
		derScanner.close();			// Scanner sollte immer geschlossen werden.

	}

}
