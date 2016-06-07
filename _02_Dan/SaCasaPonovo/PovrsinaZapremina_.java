import java.util.Scanner;

public class PovrsinaZapremina_ {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese radijus i duzinu cilindra
		System.out.print("Unesite radijus i duzinu cilindra: ");
		
		// prikupi radijus i duzinu od korisnika
		double radijus = unos.nextDouble(), duzina = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj povrsinu i radijus
		double povrsina = radijus * radijus * 3.14159;
		double zapremina = povrsina * duzina;
		
		// prikazi finalni rezultat
		System.out.println("Povrsina cilindra iznosi: " + povrsina + ".\nZapremina cilindra iznosi: " + zapremina + ".");

	}

}
