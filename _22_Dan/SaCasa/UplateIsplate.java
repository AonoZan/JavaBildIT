/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class UplateIsplate {

	public static void main(String[] args) {
		Account account = new Account("George", 1122, 1000);
		account.setAnnualInterestRate(1.5);
		account.deposit(50);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.printf("Account:\n\tid:" +
				account.getId() +
				"\n\tbalance: " +
				account.getBalance() +
				"\n\tdate: " +
				account.getDateCreated().toString());
		account.printTransactions();
	}

}
