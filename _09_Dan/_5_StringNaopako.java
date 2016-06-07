import java.util.Scanner;

public class _5_StringNaopako {

			public static void main(String[] args) {
				// create scanner
				Scanner unos = new Scanner(System.in);
				
				System.out.print("Upisite neki string: ");
				String nekaRijec = "dejan"; //unos.next();
				System.out.println();
				
				unos.close();
				
				for (int i = 0; i < nekaRijec.length(); i++) {
					System.out.print(nekaRijec.charAt(nekaRijec.length()- i - 1));
				}
				
				
		
	}
}
