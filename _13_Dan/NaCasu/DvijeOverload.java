import java.util.Scanner;

public class DvijeOverload {
	public static double[] takeInput(Scanner input, int howMany){
		double[] array = new double[howMany];
		
		for (int i = 0; i < array.length; i++) {
			double tmpInput = input.nextDouble();
			if (tmpInput < 0) {
				//System.out.println("wrong input");
				return array;
			}
			//System.out.println("take input");
			array[i] = tmpInput;
		}
		return array;
	}
	public static int[] takeInput(Scanner input, int howMany, boolean isDouble){
		int[] array = new int[howMany];
		
		for (int i = 0; i < array.length; i++) {
			int tmpInput = input.nextInt();
			if (tmpInput < 0) {
				//System.out.println("wrong input");
				return array;
			}
			//System.out.println("take input");
			array[i] = tmpInput;
		}
		return array;
	}
	public static int sumOfAll(int[] allNums){
		int sum = 0;
		for (int i = 0; i < allNums.length; i++) {
			sum += allNums[i];
		}
		return sum;
	}
	public static double sumOfAll(double[] allNums){
		double sum = 0;
		for (int i = 0; i < allNums.length; i++) {
			sum += allNums[i];
		}
		return sum;
	}
	public static int average(int[] allNums){
		return sumOfAll(allNums)/allNums.length;
	}
	public static double average(double[] allNums){
		return sumOfAll(allNums)/allNums.length;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite deset brojeva: ");
		double[] array = takeInput(input, 10);
		input.close();
		System.out.printf("\nProsjek svih brojeva je %.2f.", average(array));
	}

}
