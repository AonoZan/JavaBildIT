import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _12_Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		if(number/100 == number%10) System.out.println("Number is palindrome");
		else System.out.println("Number is not palindrome");
		
		input.close();
	}

}
