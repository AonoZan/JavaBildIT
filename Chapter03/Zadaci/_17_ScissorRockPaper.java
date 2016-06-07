import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _17_ScissorRockPaper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userInput = input.nextInt();
		int compInput = (int)(Math.random() * 3);
		input.close();
		
		System.out.print("The computer is ");
		switch (compInput) {
		case 0:
			System.out.print("scissors.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		default:
			break;
		}
		System.out.print("You are ");
		switch (userInput) {
		case 0:
			System.out.print("scissors.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		default:
			System.out.println("INVALID.");
			break;
		}
		if(userInput == compInput) System.out.println(" It's a draw.");
		else if(userInput == 2 && compInput == 1 ||
				userInput == 1 && compInput == 0 ||
				userInput == 2 && compInput == 2) System.out.println(" You won.");
		else System.out.println(" Computer won.");
		
	}

}
