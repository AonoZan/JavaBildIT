import java.util.Scanner;

public class ProcenatRacuna {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku iznos racuna
		System.out.print("Unesite iznos racuna u KM: ");
		
		// prikupi unos od korisnika
		double racun = unos.nextDouble();
		
		// prikazi upit korisniku iznos racuna
		System.out.print("Unesite iznos napojnice u procentima: ");
		
		// prikupi unos od korisnika
		double procenatNapojnice = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj kolicinu napojnice i ukupan iznos racuna
		double napojnica = (racun / 100) * procenatNapojnice;
		double ukupnaCijena = racun + napojnica; 
		
		// prikazi rezult korisniku
		System.out.println("Iznos napojnice: " + napojnica + " KM.\nUkupan iznos racuna: " + ukupnaCijena + " KM.");
		
		
	}

}
