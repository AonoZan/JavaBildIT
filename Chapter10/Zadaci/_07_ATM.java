/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.ArrayList;

public class _07_ATM {
	private String[] menuOptions = {"check balance", "withdraw", "deposit", "exit"};
	private ArrayList<Account> accounts = new ArrayList<>();
	
	private final String PASS = "admin";
	
	_07_ATM (){
	}
	public void addAccount(Account acc, String pass) {
		if (pass == this.PASS)accounts.add(acc);
	}
	public int getMenuOptionsSize() {
		return menuOptions.length;
	}
	public String doAction(int id, int menu) {
		switch (menu) {
		case 1:
			return "Balance: "
					+ String.valueOf(accounts.get(id).getBalance())
					+ "\n";
		case 2:
			System.out.print("Enter the amount you want to withdraw: ");
			accounts.get(id).withdraw(Inputs.input.nextDouble());
			break;
		case 3:
			System.out.print("Enter the amount you want to deposit: ");
			accounts.get(id).deposit(Inputs.input.nextDouble());
			break;
		case 4:
			System.out.println(accounts.get(id).getBalance());
			break;
		default:
			break;
		}
		return "____________\n";
	}
	public boolean isValidId(int id) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getId() == id) return true;
		}
		if(id != -1) System.out.println("wrong id...");
		return false;
	}
	public int askForId() {
		int id = -1;
		while(!isValidId(id)) {
			System.out.print("\n\n\n\n\n\n\n\n"
					+ "  Doboj ATM\n\n\n"
					+ "____________\n"
					+ "Enter id: ");
			id = Inputs.input.nextInt();
		}
		return id;
	}
	public boolean isValidMenu(int menu) {
		if (menu < 0 || menu > menuOptions.length) return false;
		return true;
	}
	public int showMenu(String status) {
		int menu = -1;
		System.out.println("\n\n\n\n\n\n\n\n"
				+ "   Main menu");
		for (int i = 0; i < menuOptions.length; i++) {
			System.out.printf("%2d. %s\n", (i+1), menuOptions[i]);
		}
		System.out.print(status);
		while(menu < 0 || menu > menuOptions.length) {
			System.out.print("Enter options: ");
			menu = Inputs.input.nextInt();
		}
		return menu;
	}
}
