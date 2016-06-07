import java.util.Scanner;

public class _2_PrijestupneGodine {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		
		System.out.print("Unesite dvije godine: ");
		int prvaGodina = 1507;//unos.nextInt();
		int drugaGodina = 2016;//unos.nextInt();
		System.out.println();
		
		int brojevaUredu = 0;

		// zatvori scanner
		unos.close();

		// izracunaj
		for (int i = prvaGodina; i != drugaGodina; i++) {
			if ((i % 4) == 0 && i % 400 != 0 || i % 400 == 0) {
				brojevaUredu++;
				System.out.print(i + " ");
			
				if (brojevaUredu % 10 == 0) {
					System.out.println();
				}
			}
		}
		
	}

}
