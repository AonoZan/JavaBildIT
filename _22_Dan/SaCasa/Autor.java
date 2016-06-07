/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Autor {
	private String name;
	private String email;
	private char gender;
	Autor() {
	}
	Autor(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return "Autor:"
				+ "\n\tname: "
				+ this.name
				+ "\n\temail: "
				+ this.email
				+ "\n\tgender: "
				+ this.gender;
	}
}
