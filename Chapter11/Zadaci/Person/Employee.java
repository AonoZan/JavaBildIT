/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Person;

import java.util.Date;

public class Employee extends Person {
	private int office;
	private double salary;
	private Date dateHired;
	
	Employee() {
		this(0, 0);
	}
	Employee(int office, double salary) {
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}
	Employee(int office, double salary, Date date) {
		this(office, salary);
		this.dateHired = new Date(date.getTime());
	}
	
	public void setOffice(int office) {
		this.office = office;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	public String toString() {
		return super.toString()
				+ "\n\toffice: "
				+ this.office
				+ "\n\tsalary: "
				+ this.salary
				+ "\n\tdate hired: "
				+ this.dateHired.toString();
	}
}
