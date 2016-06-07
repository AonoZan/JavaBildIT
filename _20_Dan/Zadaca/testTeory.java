/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class testTeory {

	public static void main(String[] args) {
		String string = new String();
		String another = new String();;
		
		String[] array = new String[10];
		
		for (int i = 0; i < array.length; i++) {
//			if (array[i] == null)
			if (string.equals(another))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}	

}
