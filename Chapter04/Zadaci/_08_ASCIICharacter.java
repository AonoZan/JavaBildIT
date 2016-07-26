/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _08_ASCIICharacter {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);

	public static void closeUserInput() {
		userInput.close();
	}

	public static void main(String[] args) {
		System.out.print("Enter an ASCII code: ");
		char character = (char)(userInput.nextInt());
		System.out.printf("Character for an ASCII code %d is %c", (int)(character), character);
		closeUserInput();
	}
}
