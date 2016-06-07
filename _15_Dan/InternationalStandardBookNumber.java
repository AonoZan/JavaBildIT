public class InternationalStandardBookNumber {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static int checksum = 0;
	public static int[] inputISBN(){
		int[] array = new int[9];
		String userInput = "";
		String fixWord = "";
		do {
			System.out.printf("Unesite%s %d ISBN brojeva: ", fixWord, (9 - userInput.length()));
			userInput += input.next();
			fixWord = " jos";
		} while (userInput.length() < 9);
		if (userInput.length() > 9) {
			System.out.println("\nUnjeli ste vise karaktera od predvidjenog broja.");
		}
		for (int i = 0; i < array.length; i++) {
			int num = (int)(userInput.charAt(i)) - 48;
			if (num >= 0 && num <= 9) {
				array[i] = num;
			}else {
				System.out.printf("Unjeli ste netacan karakter na \'%c\'.", userInput.charAt(i));
				break;
			}
		}
		return array;
	}
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
				System.out.printf("%d", array[i]);
		}
		//System.out.printf("%d.\n", array[array.length-1]);
	}
	public static boolean calculateChecksum(int[] array){
		for (int i = 1; i <= array.length; i++) {
			checksum+= array[i-1]*i;
		}
		checksum %= 11;
		if (checksum == 10) {
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		int[] array = inputISBN();
		printArray(array);
		if (calculateChecksum(array)) {
			System.out.println(checksum);
		}else {
			System.out.println("X");
		}
		
	}
}
