/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Person;

public class Person {
	private String name;
	private String address;
	private String phone;
	private String mail;
	
	Person() {
		this("your name here", "your address");
	}
	Person(String name, String address) {
		this(name, address, "000/000-000", "example@mail.com");
	}
	Person(String name, String address, String phone, String mail) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.mail = mail;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String toString() {
		return "\n\tname: "
				+ this.name
				+ "\n\taddress: "
				+ this.address
				+ "\n\tphone: "
				+ this.phone
				+ "\n\tmail: "
				+ this.mail;
	}
}
