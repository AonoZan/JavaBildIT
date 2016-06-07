import java.util.Scanner;


public class DuzinaAvijonskePiste {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		//prikazi upit korisniku za brzinu i ubrzanje
		System.out.print("Unesite brzinu i ubrzanje aviona: ");
		
		// prikupi unos od korisnika
		int brzina = unos.nextInt(), ubrzanje = unos.nextInt();

		// zatvori scanner
		unos.close();
		
		// izracunaj minimalnu dizinu piste
		int duzinaPiste = brzina * brzina / (2 * ubrzanje);
		
		// prikazi rezult korisniku
		System.out.println("Minimalna duzina avionske piste mora da bude : " + duzinaPiste + "m.");
		
		
	}

}
