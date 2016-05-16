/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Person;

public class Staff extends Employee{
	private String title;
	
	Staff() {
		this("no title");
	}
	Staff(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return super.toString()
				+ "\n\ttitle: "
				+ this.title;
	}
}
