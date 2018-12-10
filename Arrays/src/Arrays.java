
public class Arrays {
	// Attribute
	
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;
	private int zahl4 = 2;
	
	private int[] zahl = {1, 5, 10, 3, 2, 789, 7, 9, 1, 2, 3, 4, 5, 6, 7, 101};
	//         			  0  1  2   3  4  5    6  7  8  9  10
	
	// Methoden
	public void gebeZahlen() {
		// Zahl0-4 von Hand ausgeben
		System.out.println(zahl0 + " " + zahl1 + " " + zahl2 + " " + zahl3 + " " + zahl4);
		
		// Array ausgeben
		// for each
		// Für jedes
		for(int element : zahl) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Aufgabe:
		// Komplettes Array ausgeben aber OHNE for each Schleife
		// Versuchen Sie, mit bereits bekannten Schleifen etwas zu basteln, was das ganze Array ausgibt.
		// Zum Beispiel eine For schleife
		int k = 4;
		System.out.println(zahl[k]);
		System.out.println(zahl.length);
		
		// Laufvariable i
		// Bedingung: i muss kleiner als die Anzahl der Einträge des Arrays sein
		// Anweisung: erhöhe i nach jedem Durchlauf um 1
		for(int i = 0; i < zahl.length; i++) {
			System.out.print(zahl[i] + " ");
		}		
		
		System.out.println();
		// Arrays können wir normale Variablen nutzen
		// Werte werden genau so zugewiesen
		zahl1 = 10;
		zahl[0] = 10;
		
		for(int i = 0; i < zahl.length; i++) {
			System.out.print(zahl[i] + " ");
		}
		
		// Tragen Sie an jeder Stelle im Array den Wert 0 ein
		// Nutzen Sie die eben gelernte Schleife
		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
	}
}
