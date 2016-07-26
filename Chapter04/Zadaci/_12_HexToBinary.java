/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _12_HexToBinary {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);

	public static void closeUserInput() {
		userInput.close();
	}

	public static void main(String[] args) {
		System.out.print("Enter a hex nimber: ");
//		String line = userInput.nextLine();
//		char hex = (char)(45);
		System.out.println();
//		if (line.length() != 1){
//			System.out.println("Input must be exactly one character.");
//			System.exit(0);
//		}
//		
//		char character = line.charAt(0);
//		
//		if (Character.isDigit(character)){
//			System.out.printf("%d", (int)character-48);
//		}else if (character >= 'A' && character <= 'F'){
//			System.out.printf("%d", (int)character-55);
//		}else {
//			System.out.printf("Character \"%c\" is invalid input.", character);
//		}
		for (int i = 0; i < 16; i++) {
			System.out.printf("%d%d%d%d", i/8%2, i/4%2, i/2%2, i%2);
			System.out.println();
		}
		closeUserInput();
	}
}
