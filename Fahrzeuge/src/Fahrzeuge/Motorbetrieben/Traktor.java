package Fahrzeuge.Motorbetrieben;

import Fahrzeuge.Fahrzeug;

public class Traktor extends Fahrzeug{
	// Attribute
	private double zugKraft;
	
	// Konstruktor
	public Traktor(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch, double zugKraft) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
	
		this.zugKraft = zugKraft;
	}
	
	
	// Methoden
	public double getZugKraft() {
		return this.zugKraft;
	}

	
}
