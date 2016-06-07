package NaCasuPisano;
import java.util.Scanner;

public class PitanjeSabiranje {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		int broj1 = (int)(Math.random() * 10);
		int broj2 = (int)(Math.random() * 10);
		
		// 
		System.out.print("Koliko je " + broj1 + " plus " + broj2 + "?");

		// prikupi
		int korisnikovRezultat = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		int rezultat = broj1 + broj2;

		if (korisnikovRezultat == rezultat) {
			System.out.println("Svaka cast! Znas sabirati.");
		} else {
			System.out.println("Na zalost ne znas sabirati...\nTacan odgovor bi bio : " + rezultat);
		}

	}

}
