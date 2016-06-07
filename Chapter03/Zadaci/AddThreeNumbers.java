import java.util.Scanner;

public class AddThreeNumbers {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		int randomNumber1 = (int) (Math.random() * 10);
		int randomNumber2 = (int) (Math.random() * 10);
		int randomNumber3 = (int) (Math.random() * 10);
		// 
		System.out.printf("Koji je rezultat:\n%d + %d + %d = ", randomNumber1, randomNumber2, randomNumber3);

		// prikupi
		int korisnickiOdgovor = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		int rezultat = randomNumber1 + randomNumber2 + randomNumber3;

		if (korisnickiOdgovor == rezultat) {
			System.out.printf("Super! %d je tačan odgovor.", korisnickiOdgovor);
		} else {
			System.out.printf("Ne. %d nije tačan odgovor.", korisnickiOdgovor);
		}

	}

}
