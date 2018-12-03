
public class Rechner {
	// Attribute
	// Brauchen wir hier keine
	
	// Methoden
	// Addition
	// Rückgabewert double => Ergebnis soll vom Typ double zurückgeben werden
	// Warum? 
	// Wir wollen auch mit Kommazahlen rechnen können.
	// Wir brauchen zwei Parameter, die beiden Zahlen, die wir addieren wollen.
	double addiere(double eingabe1, double eingabe2) {
		return eingabe1 + eingabe2;
	}
	
	// Subtratkion
	double subtrahiere(double eingabe1, double eingabe2) {
		return eingabe1 - eingabe2;
	}
	
	// Multiplikation
	double multipliziere(double eingabe1, double eingabe2) {
		return eingabe1 * eingabe2;
	}
	
	// Division
	double dividiere(double eingabe1, double eingabe2) {
		return eingabe1 / eingabe2;
	}
	
	// Rest-Bestimmung (Modulo)
	double modulo(double eingabe1, double eingabe2) {
		return eingabe1 % eingabe2;
	}
	
	// Mal 2
	double mal2(double eingabe1) {
		return eingabe1*2;
	}
	
	// Hoch 2
	double hoch2(double eingabe1) {
		return eingabe1 * eingabe1;
	}
	
	// Fakultät
	int fakultaet(double eingabe1) {
		int f = 1;
		
		for(int i = 1; i<= eingabe1; i++) {
			f *= i; 	// f = f*i;
		}
		
		return f;
	}
	
}
