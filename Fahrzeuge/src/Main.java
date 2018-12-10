import Fahrzeuge.*;
import Fahrzeuge.Motorbetrieben.*;
import Fahrzeuge.Motorbetrieben.Zweiraeder.Roller;

public class Main {
	
	public static void main(String[] args) {
		// Jeweils ein Objekt von Roller, LKW, PKW, Traktor
		PKW derPKW = new PKW(4, "rot", "Opel", "Zafira", 120, 71, 6.5, "Van");
		LKW derLKW = new LKW(8, "blau", "Mercedes", "Actros", 320, 120, 15, 5000);
		Roller derRoller = new Roller(2, "schwarz", "Piaggio", "M2", 23, 20, 2, false);
		Traktor derTraktor = new Traktor(4, "grün", "John Deere", "Trekki", 60, 40, 8, 50000);
		
		// Gebe Reichweite von jedem Objekt aufrufen
		System.out.printf("Der PKW kommt %.0fkm weit.\n", derPKW.gebeReichweite());
		System.out.printf("Der LKW kommt %.0fkm weit.\n", derLKW.gebeReichweite());
		System.out.printf("Der Roller kommt %.0fkm weit.\n", derRoller.gebeReichweite());
		System.out.printf("Der Traktor kommt %.0fkm weit.\n", derTraktor.gebeReichweite());
		
		// Neue Zeile
		System.out.println();
		
		// Spezielle Methoden aufrufen
		System.out.printf("Die Ladekapazität des LKWs beträgt %.0fkg.\n", derLKW.getLadeKapazitaet());
		System.out.printf("Der PKW ist ein %s.\n", derPKW.getTyp());
		//										(bedingung 						  ? wenn wahr 	: wenn falsch)
		System.out.println("Der Roller hat " + 	(derRoller.getHatGepaeckTraeger() ? "" 			: "k") 			+ "einen Gepäckträger.");
		System.out.printf("Der Traktor kann maximal %.0fN ziehen.", derTraktor.getZugKraft());	
	}
}
