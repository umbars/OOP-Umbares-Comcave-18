
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hund Hasso= new Hund();
		Katze Mietze = new Katze();
		Vogel Papagei = new Vogel();
		
		Hasso.setztAttribute("Hasso","Border Collie", "schwarz");
		Mietze.setztAttribute("Mietze", "Perser", "Weiß");
		Papagei.setztAttribute("Papagei", "Ara", "Grün");
		
		Hasso.fresse();
		Hasso.belle();
		
		Mietze.fresse();
		Mietze.belle();
		
		Papagei.belle();
		Papagei.fresse();
		
		System.out.println(Hasso.gebeAttribute());
		System.out.println(Mietze.gebeAttribute());
		System.out.println(Papagei.gebeAttribute());

	}

}
