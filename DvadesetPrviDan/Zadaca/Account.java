/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	Account() {
		
	}
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date(System.currentTimeMillis());
	}
	
	public static void setAnnualInterestRate(double rate) {
		if(annualInterestRate == 0) annualInterestRate = rate;
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return balance * getMonthlyInterest();
	}
	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount) {
		System.out.printf("Bank status: action on account id %d\nwithdraw: ammount %.2f\n\n", this.id, amount);
		this.balance -= amount;
	}
	public void deposit(double amount) {
		System.out.printf("Bank status: action on account id %d\ndeposit: ammount %.2f\n\n", this.id, amount);
		this.balance += amount;
	}
}

//class Date {
//	private int day;
//	private int month;
//	private int year;
//	
//	Date() {
//		
//		this.day = (int)(System.currentTimeMillis() /1000 /60 /60 /24 % 365);
//		this.month = 12;
//		this.year = 2056;
//	}
//	
//	public int getDay() {
//		return day;
//	}
//	public void setDay(int day) {
//		this.day = day;
//	}
//	public int getMonth() {
//		return month;
//	}
//	public void setMonth(int month) {
//		this.month = month;
//	}
//	public int getYear() {
//		return year;
//	}
//	public void setYear(int year) {
//		this.year = year;
//	}
//	
//}