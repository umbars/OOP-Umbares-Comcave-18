
public class Tier {
	//Attribute
	protected String name;
	private String rasse;
	private String farbe;
	
	
	//Methoden
	//public void belle() {
	//	System.out.println("Wau Wau");
		
	//}
	public void fresse() {
		System.out.println("Ich habe hunger");
	}
	public void setztAttribute(String name,String rasse,String farbe) {
		this.name = name;
		this.rasse = rasse;
		this.farbe = farbe;
	}
	
   public String gebeAttribute() {
	   return ("Ich bin " + this.name + " ein "+ this.rasse +  ". Meine Farbe ist " + this.farbe);
   }
		
	

	
}
