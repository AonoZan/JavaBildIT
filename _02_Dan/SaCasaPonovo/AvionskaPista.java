import java.util.Scanner;

public class AvionskaPista {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese brzinu aviona i ubrzanje
		System.out.print("Unesite brzinu i ubrzanje aviona: ");
		
		// prikupi radijus i duzinu od korisnika
		double brzina = unos.nextDouble(), ubrzanje = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj mnimalnu duzinu piste
		double pista = (brzina * brzina) / (2 * ubrzanje);
		
		// prikazi finalni rezultat
		System.out.println("Minimalna duzina piste za ovaj avion iznosi: " + pista + ".");

	}

}
