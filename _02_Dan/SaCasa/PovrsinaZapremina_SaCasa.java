import java.util.Scanner;

public class PovrsinaZapremina_SaCasa {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		//prikazi upit korisniku za povrsinu i radijus
		System.out.print("Unesite povrsinu i radijus: ");
		
		// prikupi unos od korisnika
		double radijus = unos.nextDouble(), duzina = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj povrsinu i zapreminu
		double povrsina = radijus * radijus * 3.14159;
		double zapremina = povrsina * duzina;
		
		// prikazi rezult korisniku
		System.out.println("Povrsina jest jednako: " + povrsina + ".\nA zapremina jest jednako: " + zapremina + ".");
		
		
	}

}
