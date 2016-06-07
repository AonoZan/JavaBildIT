/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.ArrayList;
public class Zadatak {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("London");
		list.add("Denver");
		list.add("Tokyo");
		
		list.add(2, "Miami");
		
		System.out.println(list.size());
		System.out.println(list.toString());
		
		list.remove("London");
		
		System.out.println(list.size());
		System.out.println(list.toString());
		
	}

}
