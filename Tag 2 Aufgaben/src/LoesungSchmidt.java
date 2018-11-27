import static java.lang.System.out;		// Wir können Ausgaben ab sofort nur mit out.print statt System.out.print tätigen
import java.util.Scanner;

public class LoesungSchmidt {

	public static void main(String[] args) {
		Scanner derScanner = new Scanner(System.in);
		
		// Fluessigkeitsangabe
		out.println("Fluessigkeitsangabe:");
		float literEingabe = derScanner.nextFloat();
		int literAusgabe = 0;

		if (literEingabe >= 1.0f) {
			literAusgabe = (int) literEingabe;
			out.println(literAusgabe + "l");
		} else if (literEingabe >= 0.1f) {
			literAusgabe = (int) (literEingabe * 100);			// 1l = 10dl = 100cl = 1000ml 
			out.println(literAusgabe + "cl");
		} else if (literEingabe >= 0.001f) {
			literAusgabe = (int) (literEingabe * 1000);
			out.println(literAusgabe + "ml");
		} else {
			out.println("Wert muss mindestens 0.001 groß sein!");
		}
		out.println();

		// ###################################################################################################################
		// Gerade oder ungerade
		out.println("Gerade oder ungerade:");
		int zahl = 5;

		if ((zahl % 2) == 0) {		// % Modulo Operator
									// 10 % 4 = 2
									// 10 / 4 = 2 Rest 2
									// 10 % 7 = 3
									// 10 / 7 = 1 Rest 3
									// 10 % 2 = 0 => 10 ist gerade
									// 11 / 2 = 5 Rest 1
									// 11 % 2 = 1
									// 13 % 3 = 1
			out.println("Eingabe ist gerade!");
		} else {
			out.println("Eingabe ist ungerade");
		}
		out.println();

		// ###################################################################################################################
		// Auswahlemnue
		out.println("Auswahlmenue:");
		int auswahlObermenue = 3;
		int auswahlUntermenue = 1;

		if (auswahlObermenue == 1) {
			out.println("Oeffnungszeiten");
		} else if (auswahlObermenue == 2) {
			out.println("Anschrift");
		} else if (auswahlObermenue == 3) {
			switch (auswahlUntermenue) {
			case 0: {
				out.println("Hauptmenue");
				break;
			}
			case 1: {
				out.println("Termin vereinbaren");
				break;
			}
			case 2: {
				out.println("Termin absagen");
				break;
			}
			case 3: {
				out.println("Mitarbeiter sprechen");
				break;
			}
			}
		}
		out.println();

		// ###################################################################################################################
		// Schleifen
		out.println("Schleife 1: ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				out.print(i + " ");
			}
			out.println();
		}
		out.println();

		out.println("Schleife 2:");
		boolean setLineSpace = false;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 4; j++) {
				if (!setLineSpace) {
					out.print("#" + " ");
					if (j == 3) {
						setLineSpace = true;
					}
				} else {
					out.print(" " + "#");
					if (j == 3) {
						setLineSpace = false;
					}
				}
			}
			out.println();
		}
		out.println();

	}

}
