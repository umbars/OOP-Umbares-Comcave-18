
public class Auto {
	// Attribute	= 	Eigenschaften
	String marke;
	String modell;
	String serienNummer;
	int kw;
	int hubRaum;
	int anzahlSitze;
	int tankVolumen = 60;
	// int tankStand ??
	int verbrauch = 11;
	int reichweite;
	
	// Methoden		=	Fähigkeiten
	void druckeMarkeUndModell() {
		System.out.println(marke + " " + modell);
		System.out.println(serienNummer);
	}
	
	void setzeAttribute(String marke, String modell, String serienNummer,int tankVolumen,int verbrauch,int kw,int hubRaum, int anzahlSitze ) {
		this.modell = modell;
		this.marke = marke;
		this.serienNummer=serienNummer;
		this.tankVolumen=tankVolumen;
		this.verbrauch= verbrauch;
		if (anzahlSitze >=2 && anzahlSitze <=2)
			this.anzahlSitze=anzahlSitze;
		else 
			this.anzahlSitze=0;
		this.kw=kw;
		if (hubRaum>0)
			this.hubRaum=hubRaum;
		else
			this.hubRaum=0;
		
	}
	
	void fahre() {
		// nimmt Strecke in Kilometer an
		// Berechnet tankstand neu
		// Nutzen sie dazu den verbrauch 
		
		
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
