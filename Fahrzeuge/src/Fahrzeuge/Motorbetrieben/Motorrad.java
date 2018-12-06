package Fahrzeuge.Motorbetrieben;
import Fahrzeuge.Motorbetrieben.Zweiräder.*;


import Fahrzeuge.Fahrzeug;

public class Motorrad extends Fahrzeug{
	// Attribute
	protected boolean hatBeiwagen;
	Roller derRoller = new Roller();
	
	// Konstruktor
	public Motorrad(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		
		
	}
	public Motorrad() {};
	
	public void methode() {
		
	}

	
}
