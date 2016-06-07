import java.util.Scanner;


public class StringoviISpace {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite string: ");
		String string = unos.next();
		
		unos.close();
		
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i) + " ");
		}
		
		
	}

}
