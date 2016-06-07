import java.util.Scanner;

public class _05_CalculateTips {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter the subtotal and a gratuity rate: ");

		// prikupi
		int subtotal = unos.nextInt();
		int gratuityRate = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		double gratuity = (subtotal / 100.0) * gratuityRate;
		double total = subtotal + gratuity;

		// serviraj rezultat
		System.out.printf("The gratuity is $%.2f and total is $%.2f", gratuity, total);
		

	}

}
