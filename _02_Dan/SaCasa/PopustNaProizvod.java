import java.util.Scanner;

public class PopustNaProizvod {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		
		//prikazi upit korisniku za vrijednost robe u km
		System.out.print("Unesite vrijednost robe u km: ");
		
		// prikupi unos od korisnika
		double cijena = unos.nextDouble();
		
		//prikazi upit korisniku za popust robe
		System.out.print("Unesite popust na gotovionsko placanje u procentima: ");
		
		// prikupi unos od korisnika
		double popust = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj popust i ukupnu vrijednost robe
		double popustVrijednost = (cijena / 100.0) * popust;
		double ukupnaVrijednost = cijena - popustVrijednost;
		
		// prikazi rezult korisniku
		System.out.println("Povrsina popusta je: " + popustVrijednost + " KM.\nVrijednost robe sa popustom je: " + ukupnaVrijednost + " KM.");
		
		
	}

}
