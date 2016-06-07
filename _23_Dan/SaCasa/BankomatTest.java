/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class BankomatTest {
	/**@autor AonoZan Dejan Petrovic 2016 ©
	 */

	public static void ATMPower(Bankomat atm) {
		// ask for an id
		int id = atm.askForUserName();
		
		if (id == 0) {
			System.out.println("admin");
		
		
		}else{
			// create menu option and default string for status
			int menu;
			String status = "____________\n";
			// show menu
			while((menu = atm.showMenu(status)) != 4) {
				status = atm.doUserAction(id, menu);
			}
		}
	}
	
	public static void main(String[] args) {
		// create atm
		Bankomat atm = new Bankomat();
		
		// add 10 accounts with 100 credits
		for (int i = 0; i < 10; i++) {
			Account acc = new Account(i, 100);
			atm.addAccount("admin", "admin", acc);
		}
		while(true){
			ATMPower(atm);
		}
		
	}
}

