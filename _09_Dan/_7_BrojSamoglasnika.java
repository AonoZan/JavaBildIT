import java.util.Scanner;

public class _7_BrojSamoglasnika {

			public static void main(String[] args) {
				// create scanner
				Scanner unos = new Scanner(System.in);
				
				//ask for character
				System.out.print("Unesite neku recenicu: ");
				String recenica = unos.next();
				int brojSamoglasnika = 0;
				
				
				System.out.println();
				unos.close();
				
				for (int i = 0; i < recenica.length(); i++) {
					char character = recenica.toUpperCase().charAt(i);
					if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' ) {
						brojSamoglasnika++;
					}
				}
				
				System.out.printf("Broj samoglasnika u recenici:\n\" %s \"\n...iznosi: %d.", recenica, brojSamoglasnika);
	}
}
