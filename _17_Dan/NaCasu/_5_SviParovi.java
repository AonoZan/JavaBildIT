
public class _5_SviParovi {

	public static void main(String[] args) {
		System.out.println("Unesite neke brojeve: ");
		String userInput = Inputs.input.nextLine();
		int[] numbers = Inputs.userInput(userInput);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
	}

}
