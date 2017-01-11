
public class Temperaturmessungen {


	public static double generiereZufallstemperatur() {
		return (int) (Math.random() * -30) + (int) (Math.random() * 30);
	}

	public static double generiereZufallstemperatur2(int min, int max) {
		return (int) (Math.random() * min) + (int) (Math.random() * max);
	}

	// Aufgabe 10.C
	public static int kaeltesterTag(double a[]) {

		double minWert = a[0];
		int indexMinWert = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minWert) {
				minWert = a[i];
				indexMinWert = i;
			}
		}
		return indexMinWert;
	}

	// Aufgabe 10.d
	public static int waermsterTag(double a[]) {

		double maxWert = a[0];
		int indexMaxWert = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxWert) {
				maxWert = a[i];
				indexMaxWert = i;
			}
		}
		return indexMaxWert;
	}

	// Aufgabe 10e
	public static double durchschnittsTemperatur(double a[]) {
		double durchschnitt = 0.0;

		for (double wert : a) {
			durchschnitt += wert;
		}
		durchschnitt = durchschnitt / a.length;
		// durchschnitt = durchschnitt *100; //Begrenzung auf zwei
		// Nachkommerstellen wurde in der Ausgabe gemacht.
		// int temp = (int)durchschnitt;
		// durchschnitt = temp /100.0;
		return durchschnitt;
	}
}
