package Fahrzeuge.Motorbetrieben.Zweiraeder;

import Fahrzeuge.Motorbetrieben.Motorrad;


public class Roller extends Motorrad {

	// Attribute
	protected boolean hatGepaeckTraeger;
	
	// Konstruktor
	public Roller(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch, boolean hatGepackTraeger) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		this.hatGepaeckTraeger = hatGepackTraeger;
	}
	
	// Methoden
	public boolean getHatGepaeckTraeger() {
		return this.hatGepaeckTraeger;
	}
}
