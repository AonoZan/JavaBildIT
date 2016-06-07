import java.util.Scanner;

public class MakazePapirBunar {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// korisnik pogadja makaze, papir, bunar
		System.out.print("Unesite za:\nmakaze - 0\npapir - 1\nbunar - 2\n");

		// prikupi
		int korisnikPogadja = unos.nextInt();
		// zatvori scanner
		unos.close();

		// kompjuter pogadja makaze, papir, bunar
		int kompjuterPogadja = (int)(Math.random()* 3);
		
		
		switch (korisnikPogadja) {
		case 0:
			System.out.println("Izabrali ste makaze.");
			if (kompjuterPogadja == 1) {
				System.out.println("Kompjuter je izabrao papir.\nVi ste pobjedili.");
			}else if (kompjuterPogadja == 2) {
				System.out.println("Kompjuter je izabrao bunar.\nKompjuter je pobjedio.");
			}else {
				System.out.println("Kompjuter je izabrao makaze.\nNerjeseno je.");
			}
			break;
		case 1:
			System.out.println("Izabrali ste papir.");
			if (kompjuterPogadja == 1) {
				System.out.println("Kompjuter je izabrao papir.\nNerjeseno je.");
			}else if (kompjuterPogadja == 2) {
				System.out.println("Kompjuter je izabrao bunar.\nVi ste pobjedili.");
			}else {
				System.out.println("Kompjuter je izabrao makaze.\nKompjuter je pobjedio.");
			}
			break;
		case 2:
			System.out.println("Izabrali ste bunar.");
			if (kompjuterPogadja == 1) {
				System.out.println("Kompjuter je izabrao papir.\nKompjuter je pobjedio.");
			}else if (kompjuterPogadja == 2) {
				System.out.println("Kompjuter je izabrao bunar.\nNerjeseno je.");
			}else {
				System.out.println("Kompjuter je izabrao makaze.\nVi ste pobjedili.");
			}
			break;
		default:
			System.out.println("Molimo unesite tacan broj.");
			break;
		}
		
		
		

	}

}
