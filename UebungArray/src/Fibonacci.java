
public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("Anzahl Paare: \t");
		int anzahl = 8;
		for (int monat = 0;monat<anzahl;monat++) {
			System.out.printf("%5d",fibonacci(monat));
			
		}
		System.out.println();
		System.out.print("Monat: \t\t");
		
		for (int monat = 0;monat<anzahl;monat++) {
			System.out.printf("%5d",monat);
		}
		
		

		System.out.println();
		int[] fiboniacci = fibonacciZahlenBis(11);
		for (int i : fiboniacci) {
			System.out.println(i);
		}
		
		
	}
	
	
	public static int fibonacci (int monat) {
		
		if (monat == 0 || monat == 1) {
			return 1;
		}
		int anzahlVorgaender = 1;
		int anzahlVorVorgagender = 1;
		int fib = 1;
		int i = 2;
		while (i <= monat) {
			anzahlVorVorgagender = anzahlVorgaender;
			anzahlVorgaender = fib;
			fib = anzahlVorgaender + anzahlVorVorgagender;
			i++;
		}
		return fib;
	}
	
	public static int [] fibonacciZahlenBis(int n) {
		int [] fib = new int [n];
		if (n > 1) {
			fib[0] = 1;
			fib[1] = 1;
			for (int i = 2; i<n;i++) {
				fib[i] = fib[i-2] + fib[i - 1];
			}
		}
		
		return fib;
				
				
	}

}
