import java.util.Scanner;

public class _04_PoundsIntoKilograms {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Enter a number in pounds: ");

		// prikupi
		double pounds = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double kilograms = pounds * 0.454;

		// serviraj rezultat
		System.out.printf("%.3f pounds is %.3f kilograms", pounds, kilograms);

	}

}
