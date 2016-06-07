/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Transaction {
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	public String toString() {
		return "\nTransaction:"
				+ "\n\ttype: "
				+ this.type
				+ "\n\tamount: "
				+ this.amount
				+ "\n\tbalance: "
				+ this.balance
				+ "\n\tdate: "
				+ this.date
				+ "\n\tdescription: "
				+ this.description;
	}

}
