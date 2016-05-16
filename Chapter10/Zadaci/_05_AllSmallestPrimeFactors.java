/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _05_AllSmallestPrimeFactors {
	public static boolean isPrime(int number) {
		int divider = 2;
		if (number < 2) {number = 2; divider = 1;}
		for (int i = 2; i <= number/divider; i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
	public static void allPrimeFastors(int number) {
		while(number != 1) {
			for (int i = number; i > 0; i--) {
				if(number % i == 0 && isPrime(i)) {
					System.out.printf("%d ", i);
					number /= i;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter one positive number: ");
		int number = Inputs.input.nextInt();
		allPrimeFastors(number);
	}
}
