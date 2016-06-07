import java.util.Scanner;


public class IspisujeDuzinuStringa {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		String s1 = unos.next();
		
		unos.close();
		System.out.printf("Duzina stringa je: %d\nPrvi karakter stringa je %s", s1.length(), s1.charAt(0));
		
		
	}

}
