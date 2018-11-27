
public class Auto {
	// Attribute	= 	Eigenschaften
	String marke;
	String modell;
	String serienNummer;
	int kw;
	int hubRaum;
	int anzahlSitze;
	int tankVolumen = 60;
	int verbrauch = 8;
	int reichweite;
	
	// Methoden		=	Fähigkeiten
	void druckeMarkeUndModell() {
		System.out.println(marke + " " + modell);
		System.out.println(serienNummer);
	}
	
	void berechneReichweite() {
		// Tank 100l
		// Verbrauch 10l / 100km
		// Reichweite => 100l / 10l = 10 		10*100km = 1000km
		
		// Tank 60
		// Verbrauch 5l / 100km
		// Reichweite => 60l / 5l = 12 		12*100km = 1200km
		
		reichweite = tankVolumen / verbrauch * 100;
	}
	
	void druckeReichweite() {
		System.out.println("Reichweite: " + reichweite + " km");
	}
	
	void druckeInfo() {
		druckeMarkeUndModell();
		berechneReichweite();
		System.out.println("Tankvolumen: " + tankVolumen + " l");
		System.out.println("Verbrauch: " + verbrauch + "l/100 km");
		druckeReichweite();
		System.out.println();
	}
}
