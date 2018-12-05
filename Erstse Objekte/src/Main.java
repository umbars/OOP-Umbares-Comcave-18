
public class Main {

	public static void main(String[] args) {
		//Scanner derScanner = new Scanner(System.in);
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
		int meineZahl = 3;
		
		auto1.setzeAttribute("Audi", "A6", "FA284932", 72, 8, 160, 2000, 5);
		auto2.setzeAttribute("Mercedes", "E-Klasse", "FM12312332", 68, 9, 180, 3000, 7);
		auto3.setzeAttribute("BMW", "4er", "FB239021", 54, 7, 165, 2250, 4);
		
//		auto1.druckeInfo();	
//		auto2.druckeInfo();
//		auto3.druckeInfo();
		
		
		System.out.println("Die Seriennummer lautet " + auto1.getSerienNummer());
		System.out.println("Wir haben insgesamt " + (auto1.getAnzahlSitze() + auto2.getAnzahlSitze() + auto3.getAnzahlSitze()) + " Sitzplätze.");
		
		System.out.println();
		System.out.println(auto1.fehlerAuslesen("SuperGeheimesPasswort"));
		
		// Auto1 KW ausgeben
		
		// Auto1 KW ändern
		
		// Auto1 KW wieder ausgeben
		
		// Hat sich was verändert? => JA
		
	}

}
