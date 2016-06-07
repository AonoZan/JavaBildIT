import java.util.Scanner;

public class VruceHladno {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		int zamisljeniBroj = (int)(Math.random()*10);
		System.out.println("Pogodi koji sam broj zamislio? :)");

		// prikupi
		int korisnikPogadjaBroj = unos.nextInt();

		

		// izracunaj
		while (zamisljeniBroj != korisnikPogadjaBroj) {
			if (korisnikPogadjaBroj < zamisljeniBroj) {
				System.out.printf("Nije tacno.Pokusaj vece od %d.\n", korisnikPogadjaBroj);
				
			}else {
				System.out.printf("Nije tacno.Pokusaj manje od %d.\n", korisnikPogadjaBroj);
			}
			korisnikPogadjaBroj = unos.nextInt();
			
		}
		// zatvori scanner
		unos.close();
		System.out.printf("Tacno! Zamislio sam broj %d", zamisljeniBroj);

	}

}
