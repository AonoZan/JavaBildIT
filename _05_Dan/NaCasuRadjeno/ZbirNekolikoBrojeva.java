import java.util.Scanner;

public class ZbirNekolikoBrojeva {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		int integer = 1;
		int zbir = 0;
 
		while (integer > 0) {
			System.out.println("Unesite nekoliko brojeva");
			integer = unos.nextInt();
			zbir = zbir + integer;
			
			
		}
		unos.close();
		System.out.println(zbir);

		

	}

}
