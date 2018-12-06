package Fahrzeuge.Motorbetrieben;

import Fahrzeuge.Fahrzeug;

public class PKW extends Fahrzeug{
	public PKW(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		
		
		System.out.println("Typ: PKW");
		System.out.println("Konstruktor von PKW wurde genutzt!");
	}

	private String typ;
	
	public String getFarbe() {
		return "asdfgh";
	}
}
