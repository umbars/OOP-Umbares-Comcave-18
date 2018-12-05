import java.util.ArrayList;

public class Tierheim {
	// Attribute
	private ArrayList<Hund> dieHunde = new ArrayList<Hund>();
	
	// Methoden
	
	public void start() {
		// Unser komplettes Programm werden wir hier schreiben
		oeffneTierheim();
		nehmeNeuenHundAuf("Arco", "Border Collie", "schwarz", 'm', 80);
		nehmeNeuenHundAuf("Amino", "Australian Shepard", "weiﬂ", 'm', 65);
		nehmeNeuenHundAuf("Peter", "Australian Shepard", "weiﬂ", 'm', 65);
		nehmeNeuenHundAuf("Hans", "Australian Shepard", "weiﬂ", 'm', 65);
		nehmeNeuenHundAuf("Gerd", "Australian Shepard", "weiﬂ", 'm', 65);
	
		System.out.println(dieHunde.size());
		System.out.println(dieHunde.get(2).getName());
		dieHunde.add(2, new Hund("asdf", "asdf", "asdf", 'd', 12));
		System.out.println(dieHunde.get(2).getName());
		System.out.println(dieHunde.get(3).getName());
		schlieﬂeTierheim();
	}
	
	private void nehmeNeuenHundAuf(String name, String rasse, String fellFarbe, char geschlecht, int groesse) {
		dieHunde.add(new Hund(name, rasse, fellFarbe, geschlecht, groesse));
		System.out.println(dieHunde.get(dieHunde.size() - 1).getName() + " wurde aufgenommen.");
	}
	

	
	private void oeffneTierheim() {
		System.out.println("Tierheim wurde geˆffnet.");
	}
	
	private void schlieﬂeTierheim() {
		System.out.println("Tierheim wurde geschlossen.");
	}

}
