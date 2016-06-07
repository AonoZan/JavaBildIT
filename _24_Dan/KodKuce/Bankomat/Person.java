/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package Bankomat;

public class Person {
	private String name;
	private String pass;
	
	Person(){
		this("no name", "no pasword");
	}
	Person(String name, String pass){
		this.name = name;
		this.pass = pass;
	}
	
	public String getName(){
		return this.name+"";
	}
	public String getPass(){
		return this.pass;
	}
}
