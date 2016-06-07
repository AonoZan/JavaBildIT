/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _31_CurrencyExchange {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);
	public static void closeUserInput() {
		userInput.close();
	}
	public static void main(String[] args){
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = userInput.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = userInput.nextInt();
		
		System.out.print("Enter the dollar amount: ");
		double amount = userInput.nextDouble();
		
		if(choice == 0)
			System.out.printf("$%.1f is %.1f yuan", amount, (amount*rate));
		else
			System.out.printf("%.1f yuan is $%.1f", amount, (amount/rate));
		
		closeUserInput();
	}
}
