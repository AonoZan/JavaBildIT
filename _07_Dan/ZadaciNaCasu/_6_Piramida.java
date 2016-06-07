import java.util.Scanner;

public class _6_Piramida {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesi koliko zelis redova piramide: ");

		// prikupi
		int redoviPiramide = 7; //unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		for (int i = 0; i < redoviPiramide; i++) {
			for (int j = 0; j < redoviPiramide - i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j+1 + " ");
			}
			//System.out.print("1");
			for (int j = 0; j < i+1; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
			//   1
			//  212
			// 32123
			// 
		}
	}

}
//for (int j = redoviPiramide - i; j < redoviPiramide; j++) {
//	System.out.print((redoviPiramide - j) + 1);
//}