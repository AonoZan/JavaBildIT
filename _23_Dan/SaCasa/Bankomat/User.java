/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Bankomat;

public class User {
	private String name;
	private String password;
	private double balance;
	
	User() {
		this("user", "password", 100);
	}
	User(String name, String password, double balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		this.balance -= amount;
	}
}
