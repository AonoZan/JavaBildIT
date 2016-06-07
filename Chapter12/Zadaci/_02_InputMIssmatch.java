import java.util.InputMismatchException;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _02_InputMIssmatch {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);
	public static void closeUserInput() {
		userInput.close();
	}
	public static int takeUserInput(){
		String lineAsInput = userInput.nextLine();
		if(!isNumber(lineAsInput)) throw new InputNotANumberException("Input is not a number.");
		
		return Integer.parseInt(lineAsInput);
	}
	public static boolean isNumber(String integer){
		for(char c : integer.toCharArray()){
			if(!Character.isDigit(c)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int number1 = 1+(int)(Math.random() * 100), number2 = 1+(int)(Math.random() * 100);
		int userSolution = 0, solution = number1 + number2;
		while (true) {
			System.out.printf("How much is %d + %d?\n%d + %d = ", number1, number2, number1, number2);
			try {
				userSolution = takeUserInput();
				if(userSolution == solution) System.out.println("That is correct.");
				else throw new InputIncorrectException("That is not correct.");
				break;
			} catch (InputNotANumberException e) {
				System.out.println(e.getMessage());
			} catch (InputIncorrectException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.printf("Unknown exception\n%s\n", e.getMessage());
				break;
			}
			System.out.println("Try again.");
		}
		
		closeUserInput();
	}
}
class InputNotANumberException extends InputMismatchException{
	private static final long serialVersionUID = 1L;
	InputNotANumberException(String message){
		super(message);
	}
}
class InputIncorrectException extends Exception{
	private static final long serialVersionUID = 2L;
	InputIncorrectException(String message){
		super(message);
	}
}