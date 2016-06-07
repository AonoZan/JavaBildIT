import java.util.Scanner;

public class Energija {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// prikazi upit korisniku za kolicinu vode u litrima
		System.out.print("Unesite težinu vode u kiklogramima: ");

		// prikupi unos od korisnika za kolicinu vode u litrima
		double tezinaVode = unos.nextDouble();

		// prikazi upit korisniku za pocetnu temperaturu
		System.out.print("Unesite pocetnu temperaturu: ");

		// prikupi unos od korisnika za pocetnu temperaturu
		double pocetnaTemperatura = unos.nextDouble();

		// prikazi upit korisniku za zeljenu temperaturu
		System.out.print("Unesite zeljenu temperaturu: ");

		// prikupi unos od korisnika za zeljenu temperaturu
		double zeljenaTemperatura = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double energija = tezinaVode * (zeljenaTemperatura - pocetnaTemperatura) * 4184.0;

		// serviraj rezultat
		System.out.println("Energija potrebna za zagrijavanje vode: " + energija + " joula.");

	}

}
