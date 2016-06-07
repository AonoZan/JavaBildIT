package NaCasuPisano;
import java.util.Scanner;

public class BodyMassIndexSaIf {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		//
		System.out.println("Unesite vasu tezinu u kg i visinu u m:");

		// prikupi
		double tezina = unos.nextDouble();
		double visina = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double bodyMassIdex = tezina / (visina * visina);

		// provjeri stanje unesenog bmi
		if (bodyMassIdex < 18.5) {
			System.out.println("Prethranjenost");
		} else if ((bodyMassIdex <= bodyMassIdex) && (bodyMassIdex < 25.0)) {
			System.out.println("Normalan BMI");
		} else if ((25.0 <= bodyMassIdex) && (bodyMassIdex < 30.0)) {
			System.out.println("Gojaznost");
		} else if (30.0 <= bodyMassIdex) {
			System.out.println("Pretilost");
		}
	}
}
