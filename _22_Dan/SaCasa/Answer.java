import java.util.ArrayList;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Answer {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner() {input.close();}
	public static int randNum(int from, int to){
		return (int)(from + (Math.random() + (to - from)));
	}
	
	public static void main(String[] args) {
		int first = randNum(2, 10);
		int second = randNum(2, 10);
		int sum = first + second;
		int userInput;
		ArrayList<Integer> list = new ArrayList<>();
		
		
		boolean solution = false;
		while (!solution) {
			System.out.printf("How much is it: %d + %d?", first, second);
			userInput = input.nextInt();
			if(sum != userInput) {
				if (list.contains(userInput)) System.out.println("You already tryed " + userInput);
				System.out.println("Solution is not correct. Try again.");
				list.add(userInput);
			}
			else solution = true;
		}
		System.out.println("You made it...");

	}

}
