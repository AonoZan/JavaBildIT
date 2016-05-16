/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Person;

public class Faculty extends Employee {
	private int officeHours;
	private int rank;
	
	Faculty(){
		this(0, 0);
	}
	Faculty(int officeHours, int rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String toString() {
		return super.toString()
				+ "\n\toffice hours: "
				+ this.officeHours
				+ "\n\trank: "
				+ this.rank;
	}
}
