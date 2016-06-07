/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Bankomat;

public class Admin {
	private String name;
	private String password;
	
	Admin() {
		this("user", "password");
	}
	Admin(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
}
