import java.util.Scanner;


public class KonvertorMarke {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		//prikazi upit za neki iznos u dolarima
		System.out.print("Unesite iznos u dolarima: ");
		
		// prikupi unos od korisnika
		double dolari = unos.nextInt();

		// zatvori scanner
		unos.close();
		
		// pretvori dolare u marke
		double marke = dolari * 1.77;
		
		// prikazi rezult korisniku
		System.out.println(dolari + " dolara iznosi  " + marke + " KM.");
		
		
	}

}
