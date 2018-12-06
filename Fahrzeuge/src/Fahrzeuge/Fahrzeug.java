package Fahrzeuge;

public class Fahrzeug {
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
	public Fahrzeug() {
		System.out.println("Fahrzeug");
	
		System.out.println("Konstruktor von Fahrzeug wurde genutzt!");
	}
    public double gebeReichweite() {
    	
    }
    
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public double getMotorLeistung() {
		return motorLeistung;
	}

	public void setMotorLeistung(double motorLeistung) {
		this.motorLeistung = motorLeistung;
	}

	public double getTankVolumen() {
		return tankVolumen;
	}

	public void setTankVolumen(double tankVolumen) {
		this.tankVolumen = tankVolumen;
	}

	public double getTankStand() {
		return tankStand;
	}

	public void setTankStand(double tankStand) {
		this.tankStand = tankStand;
	}

	public double getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public String getMarke() {
		return marke;
	}

	// Methoden
	
	
	
	
	}

	

