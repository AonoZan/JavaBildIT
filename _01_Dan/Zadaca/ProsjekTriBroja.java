package Zadaca;
import java.util.Scanner;


public class ProsjekTriBroja {

	public static void main(String[] args) {
		// kreiraj scanner unos
		Scanner unos = new Scanner(System.in);
		
		// printaj upit korisniku za tri broja
		System.out.print("Unesite tri broja: ");
		
		// prikupi tri broja od korisnika
		int broj1 = unos.nextInt(), broj2 = unos.nextInt(), broj3 = unos.nextInt();

		// zatvori scanner
		unos.close();
		
		// izracunaj prosjek
		int prosjek = (broj1 + broj2 + broj3) / 3;
		
		// prikazi rezultat
		System.out.println("Prosjek brojeva koje ste unijeli je: " + prosjek + ".");

	}

}
