
public class Sortieren1 {
	
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
