import java.util.Date;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date date;
	
	Account() {
		this(0, 0);
	}
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.date = new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return this.date;
	}
	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}
	public double getInterestRate() {
		return this.balance * getMonthlyInterestRate();
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
}
