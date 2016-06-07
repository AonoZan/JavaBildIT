import java.util.Scanner;


public class FunteKonverter {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		//prikazi upit korisniku za kolicinu funti
		System.out.print("Unesite vrijednost u funtama: ");
		
		// prikupi unos od korisnika
		double funte = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// pretvori funte u kilograme
		double kilogrami = funte * 0.454;
		
		// prikazi rezult korisniku
		System.out.println(funte + " funti iznosi  " + kilogrami + " kilograma.");
		
		
	}

}
