package Fahrzeuge.Motorbetrieben.Zweiräder;

import Fahrzeuge.Motorbetrieben.Motorrad;


public class Roller extends Motorrad {

	// Attribute
	protected boolean hatGepaeckTraeger;
	
	// Konstruktor
	public Roller(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch, boolean hatGepackTraeger) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		
		System.out.println(super.farbe);
		System.out.println(super.hatBeiwagen);
		System.out.println(this.hatGepaeckTraeger);
	}
	
	public Roller() {
		super.hatBeiwagen = false;
	}

}
