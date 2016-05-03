/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestAccount {
	public static void printAccountDetails(Account account) {
		System.out.printf(
				"Account id: %d\n"
				+ "Balance: %.2f\n"
				+ "Annual interest rate: %.2f\n"
				+ "Monthly interest rate: %.2f\n"
				+ "Monthly Interest: %.2f\n"
				+ "Date created: %s\n\n"
				+ "-----------------------\n\n",
				account.getId(),
				account.getBalance(),
				Account.getAnnualInterestRate(),
				account.getMonthlyInterestRate(),
				account.getMonthlyInterest(),
				account.getDateCreated().toString());
	}
	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		printAccountDetails(account1);
		
		account1.withdraw(2500);
		printAccountDetails(account1);
		
		account1.deposit(3000);
		printAccountDetails(account1);
		
	}
}
