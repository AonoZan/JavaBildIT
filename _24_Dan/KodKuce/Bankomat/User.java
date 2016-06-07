/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Bankomat;

public class User extends Person{
	private int balance;
	
	User(String name, String pass, int balance){
		super(name, pass);
		this.balance = balance;
	}
	
	public int getBalance(){
		return this.balance;
	}
}
