import java.util.Scanner;

public class _20_CalculateInterest {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		//
		System.out
				.println("Enter balance and interest rate (e.g., 3 for 3%): ");

		// prikupi
		double balance = unos.nextDouble();
		double interestRate = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double interest = balance * (interestRate / 1200);

		// serviraj rezultat
		System.out.printf("The interest is %f", interest);

	}

}
