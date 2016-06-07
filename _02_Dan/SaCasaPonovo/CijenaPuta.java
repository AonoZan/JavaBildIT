import java.util.Scanner;

public class CijenaPuta {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese daljinu, potrosnju vozila i cijenu goriva
		// duzina
		System.out.print("Unesite duzinu puta koji zelite pereci: ");
		double duzina = unos.nextDouble();
		// potrosnja auta
		System.out.print("Unesite potrosnju vozila: ");
		double potrosnja = unos.nextDouble();
		// cijena goriva
		System.out.print("Unesite cijenu goriva: ");
		double cijena = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj cijenu puta
		double cijenaPut = (duzina/100) * potrosnja * cijena; // potrosnja u litrima
		double cijenaPut1 = (duzina/ potrosnja) * cijena;     // potrosnja u koliko kilometaa sa jednom litrom goriva
		
		// prikazi finalni rezultat
		System.out.println("Cijena puta iznosi: " + cijenaPut + "   " + cijenaPut1 + ".");
		// nisam siguran da li se unosi put u km potrosnja u l i cijena u markama ili...
		// 100km 7l 2.5bam      [ ]
		// 100km 14,3km 2.5bam  [x]

	}

}
