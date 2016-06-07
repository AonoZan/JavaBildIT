/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Bankomat;

public class TestStringReturn {

	public static void main(String[] args) {
		Person person = new Person("Dejan", "pass");
		
		String pass = person.getPass();
		pass = "lalala";
		
		System.out.printf("Name: %s\nPass: %s  -  %s\n",
						person.getName(),
						person.getPass(),
						pass);
		
	}

}
