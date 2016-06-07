/**@autor AonoZan Dejan Petrovic 2016 ©
 */


import java.util.ArrayList;

public class _04_MaxElementArrayList {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner() {input.close();};
	public static int max(ArrayList<Integer> list){
		int max = 0;
		for (int i : list) {
			if (i > max) max = i;
		}
		return max;
	}
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		int userInput = -1;
		while(userInput != 0) {
			System.out.print("Enter number (0 stops input):");
			userInput = input.nextInt();
			intList.add(userInput);
		}
		System.out.printf("Largest input is %d.", max(intList));
	}

}
