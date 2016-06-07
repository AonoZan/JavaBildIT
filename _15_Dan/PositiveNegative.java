
public class PositiveNegative {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static int[] results(int[] array){
		int[] results = new int[4];
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				results[0]++;
			}else {
				results[1]++;
			}
			results[2] += array[i];
		}
		results[3] = results[2] / array.length;
		return results;
	}
	public static void inputArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
	}
	public static void main(String[] args) {
		int[] userInput = new int[10];
		System.out.println("Unesite deset brojeva: ");
		inputArray(userInput);
		int[] results = results(userInput);
		System.out.printf("Unjeli ste pozitivnih %d i negativnih %d,\nzbir svih brojeva je %d a prosjek %d.\n", results[0], results[1], results[2], results[3]);
		
	}

}
