/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class AccountTest {

	public static void main(String[] args) {
		Account myAccount = new Account(1122, 20000);
		
		myAccount.setAnnualInterestRate(4.5);
		
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		System.out.printf("Account:\n\tid:" +
						myAccount.getId() +
						"\n\tbalance: " +
						myAccount.getBalance() +
						"\n\tdate: " +
						myAccount.getDateCreated().toString());
	}

}
