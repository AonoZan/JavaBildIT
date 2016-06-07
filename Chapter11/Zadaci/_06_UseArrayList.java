/**@autor AonoZan Dejan Petrovic 2016 ©
 */


import java.util.ArrayList;
import java.util.Date;

public class _06_UseArrayList {

	public static void main(String[] args) {
		ArrayList<Object> objects = new ArrayList<>();
		
		String obj1 = "String";
		Circle obj2 = new Circle();
		Loan obj3 = new Loan();
		Date obj4 = new Date();
		
		objects.add(obj1);
		objects.add(obj2);
		objects.add(obj3);
		objects.add(obj4);
		
		for (Object i : objects) {
			System.out.println(i.toString());
		}
	}
}

class Circle{
}
class Loan{
}
