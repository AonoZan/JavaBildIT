/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Person;

public class Student extends Person {
	private final String STATUS;
	
	Student() {
		this("freshman");
	}
	Student(String STATUS) {
		this.STATUS = STATUS;
	}
	
	public String toString() {
		return super.toString()
				+ "\n\tstatus: "
				+ this.STATUS;
	}
}
