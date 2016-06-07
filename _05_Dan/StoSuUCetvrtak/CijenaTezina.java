import java.util.Scanner;

public class CijenaTezina {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// Cijena i tezina prvog paketa
		System.out.print("Unesite cijenu i tezinu prvog paketa: ");
		double prviPaketCijena = 50;//unos.nextDouble();
		double prviPaketTezina = 24.99;//unos.nextDouble();
		System.out.println();
		
		// Cijena i tezina drugog paketa
		System.out.print("Unesite cijenu i tezinu rugog paketa: ");
		double drugiPaketCijena = 25;//unos.nextDouble();
		double drugiPaketTezina = 11.29;//unos.nextDouble();
		System.out.println();
		

		// zatvori scanner
		unos.close();

		// ako je cijena/tezina prvog manja od cijena/tezina druog drugi paket je bolji
		if ((prviPaketCijena / prviPaketTezina) < (drugiPaketCijena / drugiPaketTezina)) {
			System.out.println("Drugi paket ima bolju cijenu.");
		// ako nije, prvi je bolji
		}else {
			System.out.println("Prvi paket ima bolju cijenu.");
		}

	}

}
