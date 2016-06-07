import java.util.Scanner;

public class _8_KolikoVelikihSlova {

			public static void main(String[] args) {
				// create scanner
				Scanner unos = new Scanner(System.in);
				
				System.out.print("Unesite neku recenicu: ");
				String recenica = unos.next();
				int brojVelikihSlova = 0;
				
				unos.close();
				
				for (int i = 0; i < recenica.length(); i++) {
					
					if ((int)recenica.charAt(i) >= 65 && (int)recenica.charAt(i) <= 90) {
						brojVelikihSlova++;
					}
				}
				System.out.println("Broj velikih slova u recenici iznosi: " + brojVelikihSlova);
	}
}
