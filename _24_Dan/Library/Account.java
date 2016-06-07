/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Account {
	private int id;
	private String name;
	private int number;
	
	Account() {
		
	}
	Account(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void numberUp() {
		this.number++;
	}
	public void numberDown() {
		this.number--;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
}
