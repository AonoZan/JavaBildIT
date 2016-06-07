/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Account {
	private static int accountsIDs = 0;
	
	private int id;
	private String name;
	private double balance;
	
	Account(){
		this("no name", 0);
	}
	Account(String name, double balance){
		this.id = accountsIDs;
		this.name = name;
		this.balance = balance;
		accountsIDs++;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amount){
		if (amount > 0){
			this.balance += amount;
		}else return false;
		return true;
	}
	public boolean withdraw(double amount){
		if (amount >= this.balance){
			this.balance -= amount;
		}else return false;
		return true;
	}
	@Override
	public String toString(){
		return "Account:"
				+ "\n\tname: "
				+ this.name
				+ "\n\tid: "
				+ this.id
				+ "\n\tbaalance: "
				+ this.balance
				+ "\n";
	}
}
