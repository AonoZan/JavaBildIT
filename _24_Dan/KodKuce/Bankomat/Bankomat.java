/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Bankomat;

import java.util.ArrayList;

public class Bankomat {
	ArrayList<User> users = new ArrayList<>();
	ArrayList<Admin> admins = new ArrayList<>();
	
	int desetke, dvadesetke, pedesetke, stotke;
	
	Bankomat(){
		this.desetke = 60;
		this.dvadesetke = 30;
		this.pedesetke = 20;
		this.stotke = 10;
	}
	
	public int getMoneyInATM(){
		return (this.desetke * 10)
				+ (this.dvadesetke * 20)
				+ (this.pedesetke * 50)
				+ (this.stotke * 100);
	}
	
	public boolean checkValid(User user){
		for (User userInDatabase : this.users) {
			if (userInDatabase.getName() == user.getName()
					&& userInDatabase.getPass() == user.getPass()) return true;
		}
		return false;
	}
	public boolean checkValid(Admin admin){
		for (Admin adminInDatabase : this.admins) {
			if (adminInDatabase.getName() == admin.getName()
					&& adminInDatabase.getPass() == admin.getPass()) return true;
		}
		return false;
	}

	public boolean addMoney(int type, int amount){
		switch (type) {
		case 10:
			if (this.desetke <= 100 && 100 - this.desetke < amount){
				this.desetke += amount;
				return true;
			}
			else return false;
		case 20:
			if (this.dvadesetke <= 100 && 100 - this.dvadesetke < amount){
				this.dvadesetke += amount;
				return true;
			}
			else return false;
		case 50:
			if (this.pedesetke <= 100 && 100 - this.pedesetke < amount){
				this.pedesetke += amount;
				return true;
			}
			else return false;
		case 100:
			if (this.stotke <= 100 && 100 - this.stotke < amount){
				this.stotke += amount;
				return true;
			}
			else return false;
		default:
			break;
		}
		return false;
	}
	public boolean removeMoney(int type, int amount){
		switch (type) {
		case 10:
			if (this.desetke > 0 && this.desetke >= amount){
				this.desetke += amount;
				return true;
			}
			else return false;
		case 20:
			if (this.dvadesetke > 0 && this.dvadesetke >= amount){
				this.dvadesetke += amount;
				return true;
			}
			else return false;
		case 50:
			if (this.pedesetke > 0 && this.pedesetke >= amount){
				this.pedesetke += amount;
				return true;
			}
			else return false;
		case 100:
			if (this.stotke > 0 && this.stotke >= amount){
				this.stotke += amount;
				return true;
			}
			else return false;
		default:
			break;
		}
		return false;
	}

//	public int withdraw(int amount){
//		int[] types = {stotke, pedesetke, dvadesetke, desetke};
//		for (int type : types) {
//			// 
//			int num = Math.min(2,1);
//		}
//		return 1;
//	}
	
}
