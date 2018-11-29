import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner derScanner = new Scanner(System.in);
		
		Rechner derRechner = new Rechner();
		System.out.println("Willkommen beim SuperRechner v1.0");
		System.out.println();
		while (true) {
			
			System.out.println("Welche Rechneoperation möchtest Du ausführen?");
			System.out.println(" + Addition");
			System.out.println(" - Substraktoin");
			System.out.println(" * Multiplikation");
			System.out.println(" / Division");
			System.out.println(" % Rest Bestimmung");
			System.out.println(derRechner.addierte(3,5));
			
			System.out.print("Operation: ");
			char operator = derScanner.next().charAt(0);
			System.out.print("Zahl 1: ");
			double eingabe1 = derScanner.nextDouble();
			System.out.print("Zahl 2: ");
			double eingabe2 =derScanner.nextDouble();
			switch(operator) {
			case '+':
				System.out.println(derRechner.addierte(eingabe1,eingabe2));
				break;
			case '-':System.out.println(derRechner.subtrahierte(eingabe1, eingabe2));
				break;
			case '*':System.out.println(derRechner.subtrahierte(eingabe1, eingabe2));
				break;
			case '/':
				break;
			case '%':System.out.println(derRechner.modulo(eingabe1, eingabe2));
				break;
			default:System.out.println("Fehler");
				break;
			}
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}		
		