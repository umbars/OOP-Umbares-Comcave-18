package Fahrzeuge;

public abstract class Fahrzeug {
	// Attribute
	protected int anzahlRaeder;
	protected String farbe;
	protected String marke;
	protected String modell;
	protected double motorLeistung;
	protected double tankVolumen;
	protected double tankStand;
	protected double verbrauch;

	// Konstruktor
	public Fahrzeug(int anzahlRaeder, String farbe, 
			String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch) {
		// Parameter den Attributen zuweisen
		this.anzahlRaeder = anzahlRaeder;
		this.farbe = farbe;
		this.marke = marke;
		this.modell = modell;
		this.motorLeistung = motorLeistung;
		this.tankVolumen = tankVolumen;
		this.tankStand = tankVolumen;
		this.verbrauch = verbrauch;
		
		System.out.println("Ein neues Fahrzeug wurde erstellt!");
	}

	// Methoden	
	public double gebeReichweite() {
		return this.tankStand / this.verbrauch * 100;
	}
	
	// Farbe
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	// Motorleistung 
	public double getMotorLeistung() {
		return motorLeistung;
	}
	public void setMotorLeistung(double motorLeistung) {
		this.motorLeistung = motorLeistung;
	}
	
	// Tankstand
	public double getTankStand() {
		return tankStand;
	}
	public void setTankStand(double tankStand) {
		this.tankStand = tankStand;
	}
	
	// Verbrauch
	public double getVerbrauch() {
		return verbrauch;
	}
	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}
	
	// Anzahl Räder
	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}
	
	// Marke
	public String getMarke() {
		return marke;
	}
	
	// Modell
	public String getModell() {
		return modell;
	}
	
	// Tankvolumen
	public double getTankVolumen() {
		return tankVolumen;
	}
}
