/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class PrimePalindrome {
	// method for checking if number is prime
	public static boolean isPrime(int number){
		for (int i = 2; i <= number/2; i++) {	// loop from 2 to half of the number because number is not divisible with more then half of its value
			if (number % i == 0) return false;	// if at any instance number is divisible return false
		}
		return true;							// otherwise return true
	}
	// method for checking if number is palindrome
	public static boolean isPalindrome(int number){
		String numberAsString = String.valueOf(number);																// convert number to string 
		for (int i = 0; i < numberAsString.length() / 2; i++) {														// loop to half of its length
			if (numberAsString.charAt(i) != numberAsString.charAt(numberAsString.length() - 1 - i)) return false;	// if any i character form beginning not equals 
		}																											// to one from back return false
		return true;																								// otherwise return true
	}
	// method for printing largest prime palindrome in a given range
	public static void printLargestPrimePalindrome(int range){
		int largestPrimePalindrome = 0;
		for (int i = 0; i <= range; i++) {
			if (isPrime(i) && isPalindrome(i)) largestPrimePalindrome = i;
		}
		System.out.println(largestPrimePalindrome);
	}
	public static void main(String[] args) {
		printLargestPrimePalindrome(1000);
	}
}
