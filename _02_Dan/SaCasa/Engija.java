import java.util.Scanner;


public class Engija {
	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		//prikazi upit korisniku kolicinu vode
		System.out.print("Unesite iznos vode u kilogramima: ");
		// prikupi unos od korisnika
		double voda = unos.nextDouble();
		
		//prikazi upit korisniku za temperaturu
		System.out.print("Unesite pocetnu temperaturu: ");
		// prikupi unos od korisnika
		double pocetnaTemperatura = unos.nextDouble();
		
		//prikazi upit korisniku za daljinu u kilometrima potrosnju auta i cijenu goriva
		System.out.print("Unesite zeljenu temperaturu: ");
		// prikupi unos od korisnika
		double zeljenaTemperatura = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj energiju
		double energija = voda * (zeljenaTemperatura - pocetnaTemperatura) * 4184;
		
		// prikazi rezult korisniku
		System.out.println("Potrosnja energije bi bila: " + energija + " joula.");
		
		
	}

}

