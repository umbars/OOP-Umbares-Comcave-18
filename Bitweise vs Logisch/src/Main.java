
public class Main {
	public static void main(String[] args ) {
		Vergleich meinVergleich = new Vergleich();
		
		// Sucht den k�rzesten Weg
		if(meinVergleich.methode1() == 14 && meinVergleich.methode2() == 3) {
			System.out.println("Toller Vergleich");
		}
		
		// Pr�ft alles bis zum Ende durch
		if(meinVergleich.methode1() == 1 | meinVergleich.methode2() == 2) {
			System.out.println("Toller Vergleich");
		}
	}
	
}
