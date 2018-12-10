package Fahrzeuge.Motorbetrieben;

import Fahrzeuge.Fahrzeug;

public class LKW extends Fahrzeug{
	// Attribute
	private double ladeKapazitaet;
	
	// Konstruktor
	public LKW(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch, double ladeKapazitaet) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		
		this.ladeKapazitaet = ladeKapazitaet;
	}
	
	// Methoden	
	public double getLadeKapazitaet() {
		return this.ladeKapazitaet;
	}
}
