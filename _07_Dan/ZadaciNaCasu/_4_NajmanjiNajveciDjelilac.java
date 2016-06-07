import java.util.Scanner;

public class _4_NajmanjiNajveciDjelilac {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesite dva broja: ");

		// prikupi
		int prviBroj = 600; //unos.nextDouble();
		int drugiBroj = 300; //unos.nextDouble();
		
		int najmanjiZajdnicki = 1;
		int najveciZajdnicki = 1;
		
		int brojac = 2;

		// zatvori scanner
		unos.close();

		// izracunaj
		while (brojac <= prviBroj && brojac <= drugiBroj) {
			
			if (prviBroj % brojac == 0 && drugiBroj % brojac == 0) {
				if (najmanjiZajdnicki == 1) {
					najmanjiZajdnicki = brojac;
				}
				najveciZajdnicki = brojac;
			}
			brojac++;
		}
		
		System.out.printf("Najmanji zajednicki djelilac za brojeve %d i %d je %d, a najveci %d.", prviBroj, drugiBroj, najmanjiZajdnicki, najveciZajdnicki);
	}

}
