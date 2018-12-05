
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays dieArrays = new Arrays();
		dieArrays.gebeZahlen();
	    
	
		Tier dog = new Tier();
		Tier cat = new Tier();
		Tier mouse = new Tier();
		
		dog.size =  "Big";
		dog.weigth = "Heavy";
		dog.color = "Black";
		
		cat.size = "Not so big";
		cat.weigth = "Not so heavy";
		cat.color = "White";
		
		mouse.size = "Small";
		mouse.weigth = "Light";
		mouse.color = "Gray";
		
		Tier[] tierheim = {dog,mouse,cat};
		
		
	    
	}

	

}
