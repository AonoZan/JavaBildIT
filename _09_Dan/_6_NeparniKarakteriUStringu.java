import java.util.Scanner;

public class _6_NeparniKarakteriUStringu {

			public static void main(String[] args) {
				// create scanner
				Scanner unos = new Scanner(System.in);
				
				System.out.print("Upisite neki string: ");
				String nekaRijec = unos.next();
				System.out.println();
				
				unos.close();
				
				for (int i = 0; i < nekaRijec.length(); i = i + 2) {
					System.out.print(nekaRijec.charAt(i));
				}
				
	
	}
}
