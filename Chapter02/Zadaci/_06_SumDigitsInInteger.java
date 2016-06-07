import java.util.Scanner;

public class _06_SumDigitsInInteger {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Enter a number between 0 and 1000: ");

		// prikupi
		int number = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		int intiger1 = number % 10;
		int intiger2 = number / 10 % 10;
		int intiger3 = number / 100;
		
		int sum = intiger1 + intiger2 + intiger3;

		// serviraj rezultat
		System.out.printf("The sum of the digits is %d", sum);

	}

}
