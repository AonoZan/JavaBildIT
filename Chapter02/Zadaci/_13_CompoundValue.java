import java.util.Scanner;

public class _13_CompoundValue {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		double monthlySavingAmmount, savingsTotal = 0;

		// 100 * (1 + 0.00417) = 100.417
		System.out.print("Enter the monthly saving amount: ");

		// prikupi
		monthlySavingAmmount = unos.nextDouble();
		savingsTotal = monthlySavingAmmount * (1 + 0.00417);

		// zatvori scanner
		unos.close();

		// izracunaj
		for (int i = 0; i < 5; i++) {
			savingsTotal = (savingsTotal + monthlySavingAmmount) * (1 + 0.00417);
			
		}
		System.out.printf("After the sixth month, the account value is $%.3f", savingsTotal);
	}

}
