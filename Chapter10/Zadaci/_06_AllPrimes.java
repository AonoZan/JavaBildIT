/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _06_AllPrimes {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		for (int i = 0; i <= 120; i++) {
			if( _05_AllSmallestPrimeFactors.isPrime(i)) stack.push(i);
		}
		System.out.println(stack.getSize());
		for (int i = stack.getSize()-1; i >= 0; i--) {
			System.out.print(stack.pop() + " ");
		}
	}
}
