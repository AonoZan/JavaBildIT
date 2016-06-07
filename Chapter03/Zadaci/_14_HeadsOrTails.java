import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _14_HeadsOrTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randomNumber = (int)(Math.random() * 2);
		
		System.out.print("Heads or tail? (0 - 1) : ");
		int userGuess = input.nextInt();
		
		if(randomNumber == userGuess) System.out.println("Youguessed correct.");
		else System.out.println("You didn't guessed correct.");
		
		input.close();
	}

}
