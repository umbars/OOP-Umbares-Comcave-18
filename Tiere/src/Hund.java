
public class Hund {
	// Attribute
	private String name;
	private String rasse;
	private String fellFarbe;
	private char geschlecht;
	private int groesse;

	// Constructor
	public Hund(String name, String rasse, String fellFarbe, char geschlecht, int groesse) {
		setzeAttribute(name, rasse, fellFarbe, geschlecht, groesse);
	}
	
	// Methoden
	public void setzeAttribute(String name, String rasse, String fellFarbe, char geschlecht, int groesse) {
		this.name = name;
		this.rasse = rasse;
		this.fellFarbe = fellFarbe;
		this.geschlecht = geschlecht;
	}

	public void pinkele() {
	}

	public void fresse(int gewicht) {
	}

	public void pupse() {
	}

	public void trinke(double liter) {
	}
	
	public String getName() {
		return this.name;
	}
}
