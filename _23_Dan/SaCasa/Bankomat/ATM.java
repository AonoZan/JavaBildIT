/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Bankomat;

import java.util.ArrayList;

public class ATM {
	ArrayList<Admin> listOfAdmins = new ArrayList<>();
	ArrayList<User> listOfUsers = new ArrayList<>();
	
	int[] money = {60, 30 ,20, 10};
	
	private String sessionName = "";
	private String sessionPassword = "";
	private String errorMessage = "\n\n";
	
	ATM() {
		Admin admin1 = new Admin("Admin", "pass");
		this.listOfAdmins.add(admin1);
		User user1 = new User("User", "pass", 100);
		this.listOfUsers.add(user1);
	}
	ATM(int[] money) {
		this();
		this.money = money;
	}
	
 	private double amountOfMoney() {
		double sum = 0;
		int bill = 0;
		for (int i = 0; i < money.length; i++) {
			bill = ((i+1) + ((i+1) / 3) + ((i+1) / 3) + (((i+1) / 4) * 4)) * 10;
//			System.out.println(bill);
			sum += bill * money[i];
		}
		// 0  1  2  3 		indexes
		// 1  2  3  4 		adjusted indexes
		// 10 20 50 100 	required numbers from indexes
		// (i + (i / 3) + (i / 3) + ((i / 4) * 4)) * 10 = required number
		// (1 + (1 / 3) + (1 / 3) + ((1 / 4) * 4)) * 10 = 10
		// (2 + (2 / 3) + (2 / 3) + ((2 / 4) * 4)) * 10 = 20
		// (3 + (3 / 3) + (3 / 3) + ((3 / 4) * 4)) * 10 = 50
		// (4 + (4 / 3) + (4 / 3) + ((4 / 4) * 4)) * 10 = 100
		return sum;
	}
	private void showStatus() {
		System.out.printf(
				  "\tStatus\n"
				+ "------------------------------------\n"
				+ "Money in ATM: %.2f\n"
				+ "10 credits bills: %d\n"
				+ "20 credits bills: %d\n"
				+ "50 credits bills: %d\n"
				+ "100 credits bills: %d\n"
				+ "Number of admins: %d\n"
				+ "Number of users: %d\n"
				+ "\n"
				+ "------------------------------------\n",
				amountOfMoney(),
				this.money[0],
				this.money[1],
				this.money[2],
				this.money[3],
				this.listOfAdmins.size(),
				this.listOfUsers.size()
				);
	}
	private void showMenu(String type) {
		newFrame();
		if (type == "admin") {
			System.out.printf(
					"\tAdmin page"
					+ "\n--------------------------------"
					+ "\n"
					+ "\n[0] Add user"
					+ "\n[1] Remove user"
					+ "\n[2] Deposit money"
					+ "\n[3] Withdraw money"
					+ "\n[4] Show status"
					+ "\n[5] Exit"
					+ "\n"
					+ "\n--------------------------------\n"
					);
		}else if (type == "user"){
			System.out.printf(
					"\tUser page"
					+ "\n--------------------------------"
					+ "\n"
					+ "\n[0] Check balance"
					+ "\n[1] Withdraw money"
					+ "\n[2] Exit"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n--------------------------------\n"
					);
		}else if(type == "welcome"){
			System.out.printf(
					"\tWelcome"
					+ "\n--------------------------------"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\nEnter user name and password"
					+ "\n\tto continue"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n--------------------------------\n"
					);
		}else if(type == "error"){
			System.out.printf(
					"\tError"
					+ "\n"
					+ "\n--------------------------------"
					+ "\n"
					+ "\n\tWrong input"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n--------------------------------\n"
					);
		}
		if(errorMessage != "") {
			System.out.println(errorMessage+"--------------------------------");
			errorMessage = "\n\n";
		}
	}
	private String handleInput(String string) {
		String userInput = Inputs.input.next();
		switch (string) {
			case "user name":
				if (userNameValid(userInput) || adminNameValid(userInput)) return userInput;
				else errorMessage = "Name is not found\n\n";
				break;
			case "password":
				if (passwordValid(userInput)) return userInput;
				else errorMessage = "Password is not correct\n\n";
				break;
				
			case "new user":
				if (!userNameValid(userInput)) return userInput;
				else return "exist";
			case "new password":
				return userInput;
			case "new balance":
				return userInput;
			case "remove user":
				if (userNameValid(userInput)) return userInput;
				else return "dont exist";
			default:
				break;
		}
		
		return "";
	}
	private int handleInput(int number) {
		if (number == 2) {
			try{
				return Inputs.input.nextInt();
			}catch (Exception e){
				return 0;
			}
		}
		
		char c = Inputs.input.next().charAt(0);
		int userInput = Integer.valueOf(c) - 48;
		switch (number) {
			case 0:
				if (userInput >= 0 && userInput <= 5) return userInput;
				break;
			case 1:
				if (userInput >= 0 && userInput <= 3) return userInput;
				break;
			default:
				break;
		}
		errorMessage = "Wrong numerical input\n\n";
		return -1;
		
	}
	
	private boolean userNameValid(String userName) {
		for (User user: listOfUsers) {
			if(user.getName().equals(userName)) return true;
		}
		return false;
	}
	private boolean adminNameValid(String adminName) {
		for (Admin admin: listOfAdmins) {
			if(admin.getName().equals(adminName)) return true;
		}
		return false;
	}
	private boolean passwordValid(String password) {
		for (User user: listOfUsers) {
			if(user.getName().equals(sessionName) && user.getPassword().equals(password)) return true;
		}
		for (Admin admin: listOfAdmins) {
			if(admin.getName().equals(sessionName) && admin.getPassword().equals(password)) return true;
		}
		return false;
	}
	
	private User getUserFromName(String name) {
		for (User user : listOfUsers) {
			if(user.getName().equals(name)) return user;
		}
		return null;
	}
	
	private int withdraw(User user, int amount) {
		int bill;
		if (user.getBalance() < amount) return -1;
		for (int i = money.length-1; i >= 0 ; i--) {
			bill = ((i+1) + ((i+1) / 3) + ((i+1) / 3) + (((i+1) / 4) * 4)) * 10;
			if (money[i] > 0) {
				money[i] -= amount / bill;
				user.withdraw((amount / bill) * bill);
				amount = amount % bill;
			}
			
			if (amount == 0) break;
		}
		return amount;
	}
	private int withdraw(int amount) {
		int bill;
		if (amountOfMoney() < amount) return -1;
		for (int i = money.length-1; i >= 0 ; i--) {
			bill = ((i+1) + ((i+1) / 3) + ((i+1) / 3) + (((i+1) / 4) * 4)) * 10;
			
			if (money[i] > 0) {
				int m = Math.min(amount / bill, money[i]);
				money[i] -= m;
				amount -= bill * m;
			}
			
			if (amount == 0) break;
		}
		System.out.println("withdraw");
		return amount;
	}
	private int deposit(int amount, int whichBill) {
		int bill;
		for (int i = money.length-1; i >= 0 ; i--) {
			bill = ((i+1) + ((i+1) / 3) + ((i+1) / 3) + (((i+1) / 4) * 4)) * 10;
			if (whichBill == bill && money[i] < 100) {
				int m = Math.min(100 - money[i], amount / bill);
				money[i] += m;
				amount -= m * bill;
			}
			if (amount == 0) break;
		}
		return amount;
	}
	
	public void powerOn() {
		while (sessionName == "" || sessionPassword == "") {
//			errorMessage = "";
			showMenu("welcome");
			sessionName = handleInput("user name");
			if (sessionName == "") break;
			sessionPassword = handleInput("password");
		}
		int action = -1;
		if (adminNameValid(sessionName)) {
			
			while (action == -1) {
				showMenu("admin");
				action = handleInput(0);
				if (action != -1 && action != 5) doActionAdmin(action);
				else if (action == 5) {
					sessionName = "";
					break;
				}
			}
			
		}else if (userNameValid(sessionName)) {
			
			while (action == -1) {
				showMenu("user");
				action = handleInput(1);
				if (action != -1 && action != 2) doActionUser(action);
				else if (action == 2) {
					sessionName = "";
					break;
				}
				
			}
		}
		
	}
		
	private void doActionUser(int action) {
		User user = getUserFromName(sessionName);
		switch (action) {
			case 0:
				errorMessage = "\nBalance: "
								+ String.valueOf(user.getBalance())
								+ "\n";
				break;
			case 1:
				errorMessage = "\nEnter amount: \n";
				showMenu("user");
				int amount = Inputs.input.nextInt();
				int reminder = withdraw(user, amount);
				
				if (reminder == -1) {
					errorMessage = "You dont have enough money to withdraw\n ";
				}else{
					errorMessage = "You withdraw : "
								+ String.valueOf(amount - reminder)
								+ "\n";
				}
				if (reminder > 0) errorMessage += "Reminder not accepted: "
												+ String.valueOf(reminder)
												+ "\n";
				break;
			case 2:
				break;
			default:
				break;
		}
	}
	private void doActionAdmin(int action) {
		switch (action) {
			case 0:
				errorMessage = "Enter name, password\nand balance of new user\n";
				showMenu("admin");
				String userName = handleInput("new user");
				if (userName == "exist") {errorMessage = "\nUser already exist\n"; break;}
				String password = handleInput("new password");
				int balance = handleInput(2);
				User user = new User(userName, password, balance);
				this.listOfUsers.add(user);
				break;
			case 1:
				errorMessage = "Enter name of user\nyou want to remove\n";
				showMenu("admin");
				String userToRemove = handleInput("remove user");
				if(userToRemove == "dont exist") {errorMessage = "\nNo user with that name\n"; break;}
				this.listOfUsers.remove(getUserFromName(userToRemove));
				break;
			case 2:
				errorMessage = "\nWhich bill\n";
				showMenu("admin");
				int whichBill = handleInput(2); //Inputs.input.nextInt();
				if (whichBill == 0) {errorMessage = "\nWrong input\n"; break;}
				else errorMessage = "\nEnter the amount\n";
				showMenu("admin");
				int reminder = deposit(handleInput(2), whichBill);
				if (reminder > 0) errorMessage = "\nReminder: "
												+ String.valueOf(reminder)
												+ "\n";
				break;
			case 3:
				errorMessage = "Enter the amount\n";
				showMenu("admin");
				int amount = Inputs.input.nextInt();
				int reminderWithdraw = withdraw(amount);
				if (reminderWithdraw == -1) {
					errorMessage = "ATM dont have enough money to withdraw\n ";
				}else{
					errorMessage = "You withdraw : "
								+ String.valueOf(amount - reminderWithdraw)
								+ "\n";
				}
				if (reminderWithdraw > 0) errorMessage += "Reminder not accepted: "
												+ String.valueOf(reminderWithdraw)
												+ "\n";
				else errorMessage += "\n";
				break;
			case 4:
				newFrame();
				showStatus();
				System.out.println("\nPress enter to continue...\n"
						+ "------------------------------------");
				Inputs.input.nextLine();
				Inputs.input.nextLine();
			default:
				break;
		}
	}
	private void newFrame() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
 