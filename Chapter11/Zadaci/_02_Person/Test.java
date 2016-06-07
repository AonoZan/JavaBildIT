/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _02_Person;

public class Test {

	public static void main(String[] args) {
		Staff staff = new Staff("cleaning lady");
		
		staff.setName("Mira Prodanoviæ");
		staff.setAddress("Šnjegotina bb");
		staff.setPhone("053/895-896");
		staff.setMail("mira.1985@gmail.com");
		staff.setOffice(58);
		staff.setSalary(600);
		
		System.out.print("Printing stats:");
		System.out.println(staff.toString());
	}

}
