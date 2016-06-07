
/**@autor AonoZan Dejan Petrovic 2016 �
 */
import java.util.Scanner;

public class _22_ComputeChange {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		// Receive the amount
		System.out.print("Enter an amount in int, for example 1156,\nlast two digits represent cents:  ");
		double amount = input.nextInt()/100.0;

		int remainingAmount = (int) (amount * 100);
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
		input.close();
	}
}