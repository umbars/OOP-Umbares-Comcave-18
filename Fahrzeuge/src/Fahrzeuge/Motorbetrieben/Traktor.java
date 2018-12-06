package Fahrzeuge.Motorbetrieben;

import Fahrzeuge.Fahrzeug;

public class Traktor extends Fahrzeug{
	public Traktor() {
		//super();
		System.out.println("Traktor");
		
	}
	public Traktor(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch, double zugKraft) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		// TODO Auto-generated constructor stub
	}

	private double zugKraft;
	
	public void test2() {
		System.out.println("Test2");
	}
}
