/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts = new ArrayList<>();

	Bank(){
	}
	
	public boolean createAccount(String name, double balance){
		if(ifExist(name) || balance < 0) return false;
		
		Account acc = new Account(name, balance);
		accounts.add(acc);
		
		return true;
	}
	
	public boolean transferMoney(int sourceAcc, int targetAcc, double amount){
		if(		sourceAcc < 0 || sourceAcc > accounts.size() ||
				targetAcc < 0 || targetAcc > accounts.size() ||
				accounts.get(sourceAcc).getBalance() < amount||
				amount < 0){
			System.out.println("Greska! Nepostojeci id, nevazeci iznos za transfer\nili nedovoljno novca na racunu.");
			System.out.printf("\tSource account: id-%d, balance-%.2f\n"
					+ "\tTarget account: id-%d, balance-%.2f\n"
					+ "\tamount for transfer: %.2f\n",
					sourceAcc, accounts.get(sourceAcc).getBalance(),
					targetAcc, accounts.get(targetAcc).getBalance(),
					amount);
			System.out.println("-----------------------------------------------");
			return false;
		}
		
		accounts.get(sourceAcc).withdraw(amount);
		accounts.get(targetAcc).deposit(amount);
		
		return true;
	}
	
	private boolean ifExist(String name){
		for(Account acc : accounts){
			if(acc.getName().equals(name)) return true;
		}
		return false;
	}
	@Override
	public String toString(){
		StringBuilder string = new StringBuilder();
		
		string.append("\t[BANK WITH " + this.accounts.size() + " ACCOUNTS]\n");
		string.append("-----------------------------------------------\n\n");
		for (Account acc : accounts){
			string.append(acc.toString());
			string.append("-----------------------------------------------\n\n");
		}
		return string.toString();
	}
}
