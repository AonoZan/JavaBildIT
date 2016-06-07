/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _26_Operators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		System.out.printf("Is 10 divisible by 5 and 6? %b\n", (integer%5 == 0 && integer%6 == 0));
		System.out.printf("Is 10 divisible by 5 or 6? %b\n", (integer%5 == 0 || integer%6 == 0));
		System.out.printf("Is 10 divisible by 5 or 6, but not both? %b\n", (integer%5 == 0 ^ integer%6 == 0));
		
		
		input.close();
	}

}
