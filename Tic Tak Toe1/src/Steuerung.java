
public class Steuerung {
	//Attribute
	private Oberflaeche dieOberflaeche = new Oberflaeche();
	private Spieler[] spieler = new Spieler[2];
	
	
	
	//Konstruktor
	public Steuerung() {
		dieOberflaeche.gebeText("TicTacToe V1.0", true);
		
		spieler[0]= new Spieler("Hans",'O');
		spieler[1] = new Spieler ("Peter", 'O');
	}
	
	
	
	
	//Methoden
	public void start() {
		//Ganze Programm
		
		//Name von dem Spieler
		
	}
}
