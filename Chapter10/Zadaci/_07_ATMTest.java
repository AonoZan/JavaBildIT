/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _07_ATMTest {
	public static void ATMPower(_07_ATM atm) {
		// ask for an id
		int id = atm.askForId();
		
		
		
		// create menu option and default string for status
		int menu;
		String status = "____________\n";
		// show menu
		while((menu = atm.showMenu(status)) != 4) {
			status = atm.doAction(id, menu);;
		}
	}
	
	public static void main(String[] args) {
		// create atm
		_07_ATM atm = new _07_ATM();
		
		// add 10 accounts with 100 credits
		for (int i = 0; i < 10; i++) {
			Account acc = new Account(i, 100);
			atm.addAccount(acc, "admin");
		}
		while(true){
			ATMPower(atm);
		}
		
	}
}
