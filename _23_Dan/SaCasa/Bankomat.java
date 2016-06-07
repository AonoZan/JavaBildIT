/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.ArrayList;

public class Bankomat {
	private String[] userMenuOptions = {"check balance", "withdraw", "deposit", "exit"};
//	private String[] adminMenuOptions = {"check status", "add user", "remove user", "deposit money", "withdraw money", "exit"};
	
	private int[] money = {60, 30, 20 ,10};;
	private ArrayList<Account> accounts = new ArrayList<>();
	
	private String[] userNames = {"admin"};
	private String[] passwords = {"admin"};
	
	int[] session;
	
	int id;
	
	Bankomat (){
	}
	public void addAccount(String userName, String pass, Account acc) {
		if (userName == this.userNames[0] && pass == this.passwords[0])accounts.add(acc);
	}
	public void removeAccount(String userName, String pass, Account acc) {
		if (userName == this.userNames[0] && pass == this.passwords[0])accounts.remove(acc);
	}
	public void addMoney(String userName, String pass, int money, int amount) {
		if (userName == this.userNames[0] && pass == this.passwords[0]) {
			this.money[money] += amount;
		}
	}
	public void removeMoney(String userName, String pass, int money, int amount) {
		if (userName == this.userNames[0] && pass == this.passwords[0]) {
			this.money[money] -= amount;
		}
	}
	public int getMenuOptionsSize() {
		return userMenuOptions.length;
	}
	public String doUserAction(int id, int menu) {
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
	public String doAdminAction(int menu) {
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
	public int userNameValid(String userName, String password) {
		int id = -1;
		for (int i = 0; i < userNames.length; i++) {
			if (userNames.equals(userNames[i]) && password.equals(passwords[i])) {
				id = i;
				break;}
		}
		if(id != -1) System.out.println("wrong username...");
		return id;
	}
	public int askForUserName() {
		String userName = "";
		String password = "";
		int id = -1;
		while(id == -1) {
			id = userNameValid(userName, password);
			System.out.print("\n\n\n\n\n\n\n\n"
					+ "  Doboj ATM\n\n\n"
					+ "____________\n"
					+ "Enter user name and password: ");
			String[] input = Inputs.input.next().split(" ");
			userName = input[0];
			password = input[1];
		}
		return id;
	}
	public boolean admin() {
		int menu = -1;
		while(menu == -1) {
			System.out.print("\n\n\n\n\n\n\n\n"
					+ "  Doboj ATM\n\n\n"
					+ "____________\n"
					+ "Enter user name and password: ");
			menu = Inputs.input.nextInt();
		}
		return true;
	}
	public boolean isValidMenu(int menu) {
		if (menu < 0 || menu > userMenuOptions.length) return false;
		return true;
	}
	public int showMenu(String status) {
		int menu = -1;
		System.out.println("\n\n\n\n\n\n\n\n"
				+ "   Main menu");
		for (int i = 0; i < userMenuOptions.length; i++) {
			System.out.printf("%2d. %s\n", (i+1), userMenuOptions[i]);
		}
		System.out.print(status);
		while(menu < 0 || menu > userMenuOptions.length) {
			System.out.print("Enter options: ");
			menu = Inputs.input.nextInt();
		}
		return menu;
	}
}
