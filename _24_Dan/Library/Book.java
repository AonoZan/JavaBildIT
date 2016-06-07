/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Book {
	private int id;
	private String name;
	private boolean status = true;
	
	Book(){
		
	}
	Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus() {
		this.status = !this.status;
	}

}
