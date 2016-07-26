/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _28_Dan;

public class ComputeFibonnaci {
	public static long brojac = 0;
	public static long fib(long index){
		brojac++;
		System.out.println(brojac);
		if(index == 0)
			return 0;
		else if(index == 1)
			return 1;
		else
			return fib(index - 1) + fib(index - 2);
	}
	public static void main(String[] args) {
		long index = 27;
		
		System.out.println("Fibonnaci broj na indeksu " + index + " je " + fib(index));
	}
}
