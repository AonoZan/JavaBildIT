import java.util.Scanner;

public class BrojeviURastucemRedu {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesite tri cijela broja: ");

		// prikupi
		int brojJedan = unos.nextInt();
		int brojDva = unos.nextInt();
		int brojTri = unos.nextInt();

		// zatvori scanner
		unos.close();

		// provjeri da li je brojJedan manji od brojDva i brojTri
		if ((brojJedan <= brojDva) && (brojJedan <= brojTri)) {
			// provjeri da li je broj dva manji
			if (brojDva<=brojTri) {
				System.out.printf("Brojevi u rastucem redu: %d %d %d", brojJedan, brojDva, brojTri);
			// ili je veci od broja tri
			}else {
				System.out.printf("Brojevi u rastucem redu: %d %d %d", brojJedan, brojTri, brojDva);
			}
		// provjeri da li je brojDva manji od brojJedan i brojTri
		}else if ((brojDva<=brojJedan) && (brojDva <= brojTri)) {
			// provjeri da li je brojJedan manji
			if (brojJedan<=brojTri) {
				System.out.printf("Brojevi u rastucem redu: %d %d %d", brojDva, brojJedan, brojTri);
			// ili je veci od brojTri
			}else {
				System.out.printf("Brojevi u rastucem redu: %d %d %d", brojDva, brojTri, brojJedan);
			}
		// na kraju mora da je brojTri najmanji
		}else {
			// provjeri da li je brojJedan manji
			if (brojJedan<=brojDva) {
				System.out.printf("Brojevi u rastucem redu: %d %d %d", brojTri, brojJedan, brojDva);
			// ili je veci od brojDva
			}else {
				System.out.printf("Brojevi u rastucem redu: %d %d %d", brojTri, brojDva, brojJedan);
			}
		}
	}

}
