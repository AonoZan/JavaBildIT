import java.util.Scanner;

public class KonvertorMarki {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese vrijednost u dolarima
		System.out.print("Unesite iznos u dolarima: ");
		
		// prikupi iznos dolara od korisnika
		double dolari = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// prekonvertuj dolare u marke
		double marke = dolari * 1.77;
		
		// prikazi finalni rezultat
		System.out.println(dolari + " dolara iznosi " + marke + " markama.");

	}

}
