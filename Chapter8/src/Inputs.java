public class Inputs {
// globalna varijabla input koja predstavlja scanner i metoda za zatvaranje scanner-a
//--------------------------------------------
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
// metode za nasumicno generisanje char, int ili double vrjednosti u listama
//--------------------------------------------
	public static void genRand(char[] array, char from, char to){
		for (int i = 0; i < array.length; i++) {
			array[i] = (char)(from + Math.random() * (to - from));
		}
	}
	public static void genRand(int[] array, int from, int to){
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(from + Math.random() * (to - from));
		}
	}
	public static void genRand(double[] array, double from, double to){
		for (int i = 0; i < array.length; i++) {
			array[i] = from + Math.random() * (to - from);
		}
	}
// za 2D liste
	public static void genRand(char[][] array, char from, char to){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (char) (from + Math.random() * (to - from));
			}
		}
	}
	public static void genRand(int[][] array, int from, int to){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]= (int) (from + Math.random() * (to - from));
			}
		}
	}
	public static void genRand(double[][] array, double from, double to){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = from + Math.random() * (to - from);
			}
		}
	}
// metode za uzimanje podataka od korisnika u vidu char, int ili double vrjednosti 
//--------------------------------------------
	public static void inputArray(char[] array) {
		String tmp = "";
		do {
			tmp += input.next();
			//System.out.println("_" + tmp.charAt(tmp.length()-1) + "_");
		} while (tmp.length() < array.length && tmp.charAt(tmp.length()-1) != '.');
		
		for (int i = 0; i < tmp.length()-1; i++) {
			try {
				array[i] = tmp.charAt(i);
			} catch (Exception e) {
				System.out.println(". !eof!");
			}
		}
	}
	public static void inputArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if (array[i] == 0) {
				break;
			}
		}
	}
	public static void inputArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
			if (array[i] == 0) {
				break;
			}
		}
	}
// 2D liste
	public static void inputArray(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			String tmp = "";
			System.out.printf("Unesite %d char elemenata: ", array[i].length);
			do {
				tmp += input.next();
			} while (tmp.length() < array[i].length && tmp.charAt(tmp.length()-1) != '.');
			
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = tmp.charAt(j);
				if (array[i][j] == ' ') {
					break;
				}
			}
		}
	}
	public static void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
				if (array[i][j] == 0) {
					break;
				} 
			}
		}
	}
	public static void inputArray(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
				if (array[i][j] == 0) {
					break;
				} 
			}
		}
	}
// metode za printanje 1D i 2D listi
//--------------------------------------------
	public static void printArray(char[] array) {
		System.out.printf("Printam listu od %d \"char\" elemenata:\n", array.length);
		for (int i = 0; i < array.length - 1; i++) {
			System.out.printf("%c, ", array[i]);
		}
		System.out.printf("%c.\n", array[array.length-1]);
	}
	public static void printArray(int[] array) {
		System.out.printf("Printam listu od %d \"int\" elemenata:\n", array.length);
		for (int i = 0; i < array.length - 1; i++) {
			System.out.printf("%d, ", array[i]);
		}
		System.out.printf("%d.\n", array[array.length-1]);
	}
	public static void printArray(double[] array) {
		System.out.printf("Printam listu od %d \"double\" elemenata:\n", array.length);
		for (int i = 0; i < array.length - 1; i++) {
			System.out.printf("%f, ", array[i]);
		}
		System.out.printf("%f.\n", array[array.length-1]);
	}
	public static void printArray(double[] array, boolean strippedVersion) {
		System.out.printf("Printam listu od %d \"double\" elemenata(pojednostavljeno):\n", array.length);
		for (int i = 0; i < array.length - 1; i++) {
			System.out.printf("%.2f, ", array[i]);
		}
		System.out.printf("%.2f.\n", array[array.length-1]);
	}
// za 2D liste
	public static void printArray(char[][] array) {
		int charactersTotal = 0;
		for (int i = 0; i < array.length; i++) {
			charactersTotal += array[i].length;
		}
		System.out.printf("Printam 2D listu od ukupno %d \"char\" elemenata:\n", charactersTotal);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.printf("%c, ", array[i][j]);
			}
			System.out.printf("%c.\n", array[i][array[i].length-1]);
		}
	}
	public static void printArray(int[][] array) {
		int charactersTotal = 0;
		for (int i = 0; i < array.length; i++) {
			charactersTotal += array[i].length;
		}
		System.out.printf("Printam 2D listu od ukupno %d \"int\" elemenata:\n", charactersTotal);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.printf("%d, ", array[i][j]);
			}
			System.out.printf("%d.\n", array[i][array[i].length-1]);
		}
	}
	public static void printArray(double[][] array) {
		int charactersTotal = 0;
		for (int i = 0; i < array.length; i++) {
			charactersTotal += array[i].length;
		}
		System.out.printf("Printam 2D listu od ukupno %d \"double\" elemenata:\n", charactersTotal);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.printf("%f, ", array[i][j]);
			}
			System.out.printf("%f.\n", array[i][array[i].length-1]);
		}
	}
	public static void printArray(double[][] array, boolean strippedVersion) {
		int charactersTotal = 0;
		for (int i = 0; i < array.length; i++) {
			charactersTotal += array[i].length;
		}
		System.out.printf("Printam 2D listu od ukupno %d \"double\" elemenata(pojednostavljeno):\n", charactersTotal);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.printf("%.2f, ", array[i][j]);
			}
			System.out.printf("%.2f.\n", array[i][array[i].length-1]);
		}
	}
//--------------------------------------------
// main metoda moze biti izbrisana i sluzi samo za primjer i objasnjnje
	public static void main(String[] args) {
// PRIMJERI
// odkomentiraj bilo koje dvije linije koda u paru (selektuj i Ctrl+Shift+C)
//============================================
		char[] array = new char[5];			// novi 1D niz char tipa
		genRand(array, 'a', 'z');			// generise random vrjednosti od a do z za niz "array" char tipa
		
//		int[] array = new int[5];			// novi 1D niz int tipa
//		genRand(array, 50, 100);			// generise random vrjednosti od 50 do 100 za niz "array" int tipa

//		double[] array = new double[5];		// novi 1D niz double tipa
//		genRand(array, 50.0, 100.0);		// generise random vrjednosti od 50.0 do 100.0 za niz "array" double tipa
//--------------------------------------------
//		char[][] array = new char[5][5];	// novi 2D niz char tipa
//		genRand(array, 'a', 'z');			// generise random vrjednosti od a do z za niz "array" char tipa
		
//		int[][] array = new int[5][5];		// novi 2D niz int tipa
//		genRand(array, 50, 100);			// generise random vrjednosti od 50 do 100 za niz "array" int tipa

//		double[][] array = new double[5][5];// novi 2D niz double tipa
//		genRand(array, 50.0, 100.0);		// generise random vrjednosti od 50.0 do 100.0 za niz "array" double tipa
//============================================
//		char[] array = new char[5];			// novi 1D niz char tipa
//		inputArray(array);					// trazi od korsnika vrjednosti za niz "array" char tipa
		
//		int[] array = new int[5];			// novi 1D niz int tipa
//		inputArray(array);					// trazi od korsnika vrjednosti za niz "array" int tipa

//		double[] array = new double[5];		// novi 1D niz double tipa
//		inputArray(array);					// trazi od korsnika vrjednosti za niz "array" double tipa
//--------------------------------------------
//		char[][] array = new char[5][5];	// novi 2D niz char tipa
//		inputArray(array);					// generise random vrjednosti od a do z za niz "array" char tipa
		
//		int[][] array = new int[5][5];		// novi 2D niz int tipa
//		inputArray(array);					// generise random vrjednosti od 50 do 100 za niz "array" int tipa

//		double[][] array = new double[5][5];// novi 2D niz double tipa
//		inputArray(array);					// generise random vrjednosti od 50.0 do 100.0 za niz "array" double tipa
//============================================
		
		
		
		printArray(array);					// printa 1D ili 2D niz char, double ili int tipa
//		printArray(array, true);			// za printanje double vrijednosti ali skraceno na samo dva decimalna mjesta radi preglednosti (%.2f)
//		closeScanner();						// ako se koristi "inputArray()" metoda ova linija koda zatvara scanner, inace ostaje otvoren
	}

}
