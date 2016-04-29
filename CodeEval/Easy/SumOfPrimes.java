public class SumOfPrimes {
	// method for checking if number is prime
	public static boolean isPrime(int number){
		for (int i = 2; i <= number/2; i++) {	// loop from 2 to half of the number because number is not divisible with more then half of its value
			if (number % i == 0) return false;	// if at any instance number is divisible return false
		}
		return true;							// otherwise return true
	}
	// method for printing sum first "howMany" primes
	public static void printSumOfPrimes(int howMany){
		int sum = 0;									// create sum of all primes variable
		int primesCount = 0;							// create variable to count primes
		int i = 2;										// create variable for checking numbers if they are primes
		while (primesCount != howMany) {				// while counter does'nt reach limit
			if(isPrime(i)) {							// if current number is prime
				sum += i;								// add to sum
				primesCount++;							// and count it
			}
			i++;										// switch to next number
		}
		System.out.println(sum);						// print su at the end
	}
	public static void main(String[] args) {
		printSumOfPrimes(1000);
	}

}
