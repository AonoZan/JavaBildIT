import java.util.Scanner;

public class PopustNaRobu {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		
		// prikazi upit korisniku da unese vrijednost robe
		System.out.print("Unesite vrijednost robe u KM: ");

		// prikupi vrijednost robe od korisnika
		double cijena = unos.nextDouble();

		// prikazi upit korisniku da unese procenat popusta
		System.out.print("Unesite popust na gotovinsko placanje u procentima: ");

		// prikupi procenat popusta od korisnika
		double popustProcenat = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj kolicinu popusta i ukupnu cijenu
		double popust = (cijena / 100) * popustProcenat;
		double cijenaUkupno = cijena - popust;

		// prikazi finalni rezultat
		System.out.println("Vrijednost popusta je: " + popust + " KM.\nVrijednost robe sa popustom je: " + cijenaUkupno + " KM.");

	}

}
