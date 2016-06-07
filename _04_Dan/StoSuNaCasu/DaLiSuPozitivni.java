import java.util.Scanner;

public class DaLiSuPozitivni {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesite dva cijela broja: ");

		// prikupi
		int prviBroj = unos.nextInt();
		int drugiBroj = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		if (prviBroj > 0 && drugiBroj > 0) {
			System.out.println("Ova dva broja su pozitivni.");
		} else if (prviBroj < 0){
			System.out.printf("%d broj nije pozitivan.", prviBroj);
		} else if (drugiBroj < 0) {
			System.out.printf("%d broj nije pozitivan.", drugiBroj);
		} else {
			System.out.println("Greška!");
		}
	}

}
