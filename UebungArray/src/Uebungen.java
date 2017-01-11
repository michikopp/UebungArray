public class Uebungen {


	//Aufgabe 2

	public static void druckeArray(int [] a) {
		System.out.print("Index:\t");
		for (int i=0;i<a.length;i++) {
			System.out.printf("%5d",a[i]);
		}
		System.out.println();
		System.out.print("Wert:\t");
		for (int  i = 0; i<a.length;i++) {
			System.out.printf("%5d",i);
		}
		System.out.println();
	}
	
	//Aufgabe 3
//	public static int gibQuersumme(int zahl) {
//		int quersumme = 0;
//		char[] einzelneZahlen= ("" + zahl).toCharArray();
//		
//		for(char einzelneZahl : einzelneZahlen) {
//			quersumme += (int)(einzelneZahl - '0');
//		}
//		return quersumme;
//	}
	//Aufgabe 3 Lösung Lehrer
	public static int gibQuersumme(int zahl) {
		int quersumme = 0;
		while (zahl != 0) {
			quersumme += zahl %10;
			zahl /= 10;			
		}
		return quersumme;
	}
	
	//Aufgabe 5
	public static int bildeSummeArray(int [] a) {
		int summe = 0;
		for (int zahl : a) {
			summe += zahl;
		}
		
		return summe;
	}
	
	//Aufgabe 7
	public static int gibMaxWert(int [] a) {
		int maxWert = a[0];
		for(int wert : a) {
			if (wert > maxWert) {
				maxWert = wert;
			}
		}
		return maxWert;
	}
	//Aufgabe 7 Rückgabe des Idexes und nicht vom Wert.
	public static int indexMaxWert(int [] a) {
		int maximum = a[0];
		int pos = 0;
		for (int i = 1; i < a.length;i++) {
			if (a[i] > maximum) {
				maximum = a[i];
				pos = i;
			}
		}
		return pos;
	}
	
	
	//Aufgabe 9
	public int[] arrayKopieren(int [] a) {
		int [] rueckgabe = new int[a.length];
		for(int i=0;i<a.length;i++) {
			rueckgabe[i] = a[i];
		}
		return rueckgabe;
	}
	
	
	//###################################################################################################
	//MainBereich
	public static void main(String[] args) {
		
		//Aufgabe 1
		int [] quadrat;
		quadrat = new int [20];
		
		for (int i=0;i<quadrat.length;i++) {
			quadrat[i] = i*i;
		}
		
		for (int quadZahl : quadrat) {
			System.out.println(quadZahl);
		}
		
		//Aufgabe 2 Ausgabe
		System.out.println("--------------Aufgabe 2----------------");
		Uebungen.druckeArray(quadrat);
		
		//Aufgabe3 Augabe
		System.out.println("--------------Aufgabe 3----------------");
		System.out.println(Uebungen.gibQuersumme(155));
		
		//Aufgabe 4
		System.out.println("--------------Aufgabe 4----------------");
		int [] quersumme = new int [50];
		
		for (int i = 0; i<quersumme.length;i++) {
			quersumme[i] = Uebungen.gibQuersumme(i);
		}
		
		Uebungen.druckeArray(quersumme);
		//Ausgabe 5
		System.out.println("--------------Aufgabe 5----------------");
		System.out.println(Uebungen.bildeSummeArray(quadrat));
		
		//Aufgabe 6
		System.out.println("--------------Aufgabe 6----------------");
		System.out.println("Mittelwert Quersumme: " + (double)(Uebungen.bildeSummeArray(quersumme) / quersumme.length));
		System.out.println("Mittelwert Quadrat: " + (double) (Uebungen.bildeSummeArray(quadrat) / quadrat.length));
		
		//Aufgabe 7 test
		System.out.println("--------------Aufgabe 7----------------");
//		int [] testArray = new int [5];
//		testArray[0] = 1;
//		testArray[1] = 5;
//		testArray[2] = 100;
//		testArray[3] = 299;
//		testArray[4] = 6;
//		System.out.println(Uebungen.gibMaxWert(testArray));
		
		//Aufgabe 8
		System.out.println("--------------Aufgabe 8----------------");
		System.out.println("Quadrat höchtese Zahl: " + Uebungen.gibMaxWert(quadrat));
		System.out.println("Quersumme höchste Zahl: " + Uebungen.gibMaxWert(quersumme));
		//Aufgabe 8 mit Index
		System.out.println("Das Maximum des Arrays Quadrat liegt an Position: " + indexMaxWert(quadrat) + " und hat den Wert: " + quadrat[indexMaxWert(quadrat)]);
		System.out.println("Das Maximum des Arrays Quersumme liegt an Position: " + indexMaxWert(quersumme) + " und hat den Wert: " + quersumme[indexMaxWert(quersumme)]);
		
		
		//Aufgabe 10
		double [] jahresTemperaturen = new double [365];
		
		System.out.println("--------------Aufgabe 10----------------");
		System.out.println(Temperaturmessungen.generiereZufallstemperatur());
		System.out.println(Temperaturmessungen.generiereZufallstemperatur2(-30, 30));
		
		//Array jahresTemperaturen befüllen
		for(int i=0;i<jahresTemperaturen.length;i++) {
			jahresTemperaturen[i] =Temperaturmessungen.generiereZufallstemperatur();			
		}
		
		//Aufgabe 10.C
		System.out.println("--------------Aufgabe 10.C----------------");		
		int indexMin = Temperaturmessungen.kaeltesterTag(jahresTemperaturen);
		System.out.println("Kältester Tag: " + (indexMin+1) + " Mit: " +jahresTemperaturen[indexMin]);
		
		//Aufgabe 10.D
		System.out.println("--------------Aufgabe 10.D----------------");				
				int indexMax = Temperaturmessungen.waermsterTag(jahresTemperaturen);
		System.out.println("Wärmster Tag: " + (indexMax+1) + " Mit: "  + jahresTemperaturen[indexMax]);
		
		//Aufgabe 10.E
		System.out.println("--------------Aufgabe 10.E----------------");
		System.out.println("Durchschnittstemperatur: " + Temperaturmessungen.durchschnittsTemperatur(jahresTemperaturen));
		System.out.printf("Durchschnitt: %.2f", Temperaturmessungen.durchschnittsTemperatur(jahresTemperaturen));
	
		
	}	
	
}
