import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese tezinu i visinu neke osobe
		System.out.print("Unesite tezinu i visinu: ");
		
		// prikupi unos od korisnika
		double tezina = unos.nextDouble(), visina = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj BMI
		double bmi = tezina / (visina * visina);
		
		// prikazi finalni rezultat
		System.out.println("Body mass index je: " + bmi + ".");

	}

}
