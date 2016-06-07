package NaCasuPisano;
import java.util.Scanner;

public class PrepravljenaPovrsinaKruga {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese duzinu ivice kocke
		System.out.print("Unesite duzinu ivice kocke: ");
		
		// prikupi unos od korisnika
		double poluprecnik = unos.nextDouble();
		
		unos.close();
		
		if (poluprecnik <= 0) {
			double povrsinaKruga = poluprecnik * 3.14159;
			System.out.println("Povrsina kruga iznosi : " + povrsinaKruga);
		}else {
			System.out.println("Molimo unesite vrjdnost poluprecnika veci od 0");
		}

	}

}