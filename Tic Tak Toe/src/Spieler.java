
public class Spieler {
	//Attribute
	private String name;
	private char spielStein;
	private int anzahlSiege;
	
	
	//Konstruktor
	public Spieler(String name, char spielStein) {
		
		this.name = name;
		this.spielStein = spielStein;
		this.anzahlSiege = 0;
	}
 // Methode

	public String getName() {
		return name;
	}

	public char getSpielStein() {
		return spielStein;
	}

	public int getAnzahlSiege() {
		return anzahlSiege;
	}

    public void speicherSieg() {
    	this.anzahlSiege ++;
	
	}

}
