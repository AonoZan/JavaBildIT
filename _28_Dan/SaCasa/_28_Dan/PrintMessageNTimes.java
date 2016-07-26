/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _28_Dan;

public class PrintMessageNTimes {
	public static void nPrintLn(String message, int times){
		if (times >= 1){
			System.out.println(message);
			nPrintLn(message, times - 1);
		}
	}
	public static void main(String[] args) {
		nPrintLn("Recurzija je zabavna.", 50);
	}
}
