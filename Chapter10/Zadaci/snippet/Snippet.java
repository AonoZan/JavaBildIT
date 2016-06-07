/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package snippet;

public class Snippet {
	public static void main(String[] args) {
		System.out.println("Hi, ABC, good".matches("ABC "));
		System.out.println("Hi, ABC, good".matches(".*ABC.*"));
		System.out.println("A,B;C".replaceAll(",;", "#"));
		System.out.println("A,B;C".replaceAll("[,;]", "#"));
		String[] tokens = "A,B;C".split("[,;]");
		for (int i = 0; i < tokens.length; i++)
		System.out.print(tokens[i] + " ");
//		print(new char[]{'a', 'b', 'c'});
	}
	
	public static void print(char[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}