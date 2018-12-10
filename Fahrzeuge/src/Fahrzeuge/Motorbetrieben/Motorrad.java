package Fahrzeuge.Motorbetrieben;


import Fahrzeuge.Fahrzeug;

public class Motorrad extends Fahrzeug{
	// Attribute
	protected boolean hatBeiwagen;
	
	// Konstruktor
	public Motorrad(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);		
	}
	
	// Methoden
	public boolean getHatBeiwagen() {
		return this.hatBeiwagen;
	}
}
