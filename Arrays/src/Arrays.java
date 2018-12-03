
public class Arrays {
	//Attribute
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;
	private int zahl4 = 2;
	
	private int[] zahl = {1,5,10,3,2,4,56,12,534,23};
	//                    0 1  2 3 4
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
	}
}
