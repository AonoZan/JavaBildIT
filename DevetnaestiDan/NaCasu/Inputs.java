
public class Inputs {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner() {input.close();}
	public static int[] userInput(String string){
		String[] wordArray = string.split(" ");
		int[] numberArray = new int[wordArray.length];
		for (int i = 0; i < wordArray.length; i++) {
			numberArray[i] = Integer.valueOf(wordArray[i]);
		}
		return numberArray;
	}
	public static void genRandom(int[] array, int from, int to){
		for (int i = 0; i < array.length; i++) {
			array[i] = from + (int)(Math.random() * (to - from + 1));
		}
	}
}
