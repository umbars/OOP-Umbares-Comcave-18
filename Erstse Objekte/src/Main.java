
public class Main {

	public static void main(String[] args) {
		//Scanner derScanner = new Scanner(System.in);
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
		auto1.marke = "Audi";
		auto1.modell = "A6";
		auto2.marke = "Mercedes";
		auto2.modell = "C-Klasse";
		auto3.marke = "BMW";
		auto3.modell = "3er";
		
		auto1.serienNummer = "4894078963";
		auto3.anzahlSitze = 5;
		
		auto1.tankVolumen = 72;		// Angaben in l
		auto1.verbrauch = 8;		// Angaben in l
		
		auto2.tankVolumen = 90;
		
//		auto1.druckeMarkeUndModell();
//		auto1.berechneReichweite();
//		auto1.druckeReichweite();
//		Wurde in druckeInfo() zusammengefasst		
		auto1.druckeInfo();	// Gibt das selbe aus, wie Zeile die letzen Zeilen
		auto2.druckeInfo();
		auto3.druckeInfo();
		
	}

}
