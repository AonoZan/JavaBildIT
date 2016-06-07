import java.util.Scanner;


public class DaljinaUKilometrima {
	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		//prikazi upit korisniku za daljinu u kilometrima potrosnju auta i cijenu goriva
		System.out.print("Unesite daljinu koju zelite preci: ");
		// prikupi unos od korisnika
		double daljina = unos.nextDouble();
		
		//prikazi upit korisniku za daljinu u kilometrima potrosnju auta i cijenu goriva
		System.out.print("Unesite potrosnju vozila: ");
		// prikupi unos od korisnika
		double potrosnja = unos.nextDouble();
		
		//prikazi upit korisniku za daljinu u kilometrima potrosnju auta i cijenu goriva
		System.out.print("Unesite cijenu goriva: ");
		// prikupi unos od korisnika
		double cijena = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj cijenu puta
		double cijenaPuta = (daljina / potrosnja) + cijena;
		
		// prikazi rezult korisniku
		System.out.println("Ciijena puta je: " + cijenaPuta + ".");
		
		
	}

}

