import java.util.Scanner;
public class Oberflaeche {
	//Attribute
	private Scanner derScanner = new Scanner(System.in);
	
	
	//Methoden   
	public void gebeText(String text, boolean neueZeile) {
		System.out.println(text + (neueZeile ? "\n" : ""));
		
	}
	public String leseText () {
		return derScanner.next();
		
	}
	public char leseZeichen() {
		return derScanner.next().charAt(0);
	}

}
