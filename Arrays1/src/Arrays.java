
public class Arrays {
	//Attribute
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;
	private int zahl4 = 2;
	
	//Arrays
	//Länge muss definiert sein
	//Länge kann nicht verändern werden
	
	//Direkte Inizialisierung
	private String[] worte = {"Hallo","Welt"};
	private int[] zahl = {1,5,10,3,2,4,56,12,534,23};
	//                    0 1  2 3 4
	// Ohne Werte
	private int[] zahlen = new int[10];
	
	
	//Methoden
	public void gebeZahlen() {
		System.out.println(zahl0 + " " +zahl1+" "+ zahl2 + " " + zahl3 + " " + zahl4);
		System.out.println(zahl[1]);
		// for each
		for(int element : zahl) {
			System.out.print(element + " ");
		}
	    System.out.println();
	    
	    int i =4;
	    System.out.println(zahl[i]);
		System.out.println(zahl.length);
		
		
		for(int k= 0; k<zahl.length;k++) {
		System.out.print(zahl[k]+ " ");	
		}
		System.out.println();
		zahl1 = 20;
		zahl[0]=20; 
		
		for(int k= 0; k<zahl.length;k++) {
			System.out.print(zahl[k]+ " ");	
			
		}
		System.out.println();
		for (int l=0;l<zahl.length;l++) {
			zahl[l]=0;
			System.out.print(zahl[l]+ " ");
					
		}
		System.out.println();
		String[] tierHeim = {
				  "Haus", "Maus","Dog","Bird","Fish","Cat"};
		System.out.println(tierHeim[2]);
		System.out.println();
		for(int a= 0; a<tierHeim.length;a++) {
			System.out.print(tierHeim[a]+ " ");
	   }
		System.out.println();

		Tier dog = new Tier();
		Tier cat = new Tier();
		Tier mouse = new Tier();
		
		dog.name = "Dog";
		dog.size =  "Big";
		dog.weigth = "Heavy";
		dog.color = "Black";
		
		cat.name = "Cat";
		cat.size = "Not so big";
		cat.weigth = "Not so heavy";
		cat.color = "White";
		
		mouse.name = "Mouse";
		mouse.size = "Small";
		mouse.weigth = "Light";
		mouse.color = "Gray";
		
		Tier[] tierheim = {dog,mouse,cat};
		for(int t=0;t<tierheim.length;t++) {
			System.out.println(tierheim[t].name + " = "+ tierheim[t].size + ","+tierheim[t].weigth +","+ tierheim[t].color );
		}
	}
		 
			private void gebeIntArrayForEach(int[] array) { 
			                // Array ausgeben 
			                // for each 
			                // Für jedes 
			                for (int element : array) { 
			                        System.out.print(element + " "); 
			                } 
			        } 

			        private void gebeIntArrayFor(int[] array) { 
			                // Aufgabe: 
			                // Komplettes Array ausgeben aber OHNE for each Schleife 
			                // Versuchen Sie, mit bereits bekannten Schleifen etwas zu basteln, was das 
			                // ganze Array ausgibt. 
			                // Zum Beispiel eine For schleife 
			                
			                // Laufvariable i 
			                // Bedingung: i muss kleiner als die Anzahl der Einträge des Arrays sein 
			                // Anweisung: erhöhe i nach jedem Durchlauf um 1 
			                for (int i = 0; i < array.length; i++) { 
			                        System.out.print(array[i] + " "); 
			                } 
			        } 
			        
			        private void setzeArray(int[] array, int wert) { 
			                for (int i = 0; i < array.length; i++) { 
			                        array[i] = wert; 
			                } 
			        } 
			        
			        private void setzeArray(int[] array) { 
			                for (int i = 0; i < array.length; i++) { 
			                        array[i] = gebeZufallszahl(); 
			                } 
			        } 
			        
			        private int gebeZufallszahl() { 
			                return (int)(Math.random()*100); 
			        } 
			        
			        private void sortiereAufsteigend(int[] array) { 
			                // Bubblesort 
			                // 1. Zahlen tauschen 
			                
			        }

			
	
		
		

		
		
		
	}

