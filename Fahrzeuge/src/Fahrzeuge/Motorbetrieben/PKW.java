package Fahrzeuge.Motorbetrieben;

import Fahrzeuge.Fahrzeug;

public class PKW extends Fahrzeug{
	// Attribute
	private String typ;
	
	// Konstruktor
	public PKW(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch, String typ) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		
		this.typ = typ;
	}

	// Methoden
	public String getTyp() {
		return this.typ;
	}
}
