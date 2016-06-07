/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class StringTest {

	public static void main(String[] args) {
		String[] string = new String[10];
		for (int i = 0; i < string.length; i++) {
			if(string[i] == null) System.out.println("Yes");
			else System.out.println("No");
		}
		for (int i = 0; i < string.length; i++) {
			string[i] = "neki string";
		}
		
		for (int i = 0; i < string.length; i++) {
			if(string[i] == null) System.out.println("Yes");
			else System.out.println("No");
		}
		for (int i = 0; i < string.length; i++) {
			string[i] = null;
		}
		for (int i = 0; i < string.length; i++) {
			if(string[i] == null) System.out.println("Yes");
			else System.out.println("No");
		}
	}

}
