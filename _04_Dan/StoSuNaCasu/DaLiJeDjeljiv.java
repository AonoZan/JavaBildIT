import java.util.Scanner;

public class DaLiJeDjeljiv {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite jedan cijelui broj: ");
		int cijeliBroj = unos.nextInt();
		System.out.println();
		
		// zatvori scanner
		unos.close();

		// broj je djeljiv sa nekim brojem ako je ostatak toga broja jednak nuli
		System.out.println("Broj je djeljiv i sa 5 i sa 6: " + (((cijeliBroj%5) == 0) && ((cijeliBroj%6) == 0)));
		System.out.println("Broj je djeljiv ili sa 5 ili sa 6: " + (((cijeliBroj%5) == 0) || ((cijeliBroj%6) == 0)));
		System.out.println("Broj je djeljiv sa 5 ili sa 6 ali ne sa oba: " + (((cijeliBroj%5) == 0) ^ ((cijeliBroj%6) == 0)));
			
		
	}

}
