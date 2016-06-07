import java.util.Scanner;

public class KonvertorFunti {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese vrijednost u funtama
		System.out.print("Unesite vrijednost u funtama: ");
		
		// prikupi kolicinu funti od korisnika
		double funte = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// prekonvertuj funte u kilograme
		double kilogrami = funte * 0.454;
		
		// prikazi finalni rezultat
		System.out.println(funte + " funti iznosi " + kilogrami + " kilograma.");

	}

}
