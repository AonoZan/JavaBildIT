import java.util.Scanner;

public class ProsjekOcjena {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Unesi tri ocjene: ");
		double prvaOcjena = 2;//unos.nextInt();
		double drugaOcjena = 3;//unos.nextInt();
		double trecaOcjena = 5;//unos.nextInt();
		System.out.println();

		// zatvori scanner
		unos.close();

		// izracunaj
		if (prvaOcjena == 1 || drugaOcjena == 1 || trecaOcjena == 1) {
			System.out.println("Pao si...");
		}else {
			System.out.printf("Prosjek tvojih ocjena je: %f", ((prvaOcjena + drugaOcjena + trecaOcjena) / 3));
		}

	}

}
