import java.util.ArrayList;
import java.util.Date;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Account {
	private String name;
	private ArrayList<Transaction> transactions;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date date;
	
	Account() {
		this(0, 0);
	}
	Account(int id, double balance) {
		this.transactions = new ArrayList<>();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.date = new Date();
	}
	Account(String name, int id, double balance) {
		this(id, balance);
		this.name = name;
	}
	
	public String getName() {
		return name;
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
		Transaction uplata = new Transaction('D', amount, this.balance, "Nova uplata.");
		this.transactions.add(uplata);
	}
	public void withdraw(double amount) {
		this.balance -= amount;
		Transaction isplata = new Transaction('W', amount, this.balance, "Nova isplata.");
		this.transactions.add(isplata);
	}
	public void printTransactions() {
		for (Transaction i : this.transactions) {
			System.out.println(i.toString());
		}
	}
}
