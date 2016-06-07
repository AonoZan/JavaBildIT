/**
 * @autor AonoZan Dejan Petrovic 2016
 */
import java.util.Scanner;

public class Custom {
	//-----------------------------------------------
	public static Scanner input = new Scanner(System.in);
	public static int[] takeInput(int howMany){
		int[] array = new int[1];
		for (int i = 0; i < howMany; i++) {
			int userInput = input.nextInt();
			if (userInput != 0) {
				int[] newArray = new int[i+1];
				for (int j = 0; j < array.length; j++) {
					newArray[j] = array[j];
				}
				newArray[i] = userInput;
				array = newArray;
			}else {
				break;
			}
		}
		return array;
	}
	public static double[] takeInput(double howMany){
		double[] array = new double[1];
		for (int i = 0; i < howMany; i++) {
			double userInput = input.nextDouble();
			if (userInput != 0) {
				double[] newArray = new double[i+1];
				for (int j = 0; j < array.length; j++) {
					newArray[j] = array[j];
				}
				newArray[i] = userInput;
				array = newArray;
			}else {
				break;
			}
		}
		return array;
	}
	public static void closeScanner(){
		input.close();
	}
	//-----------------------------------------------
	public static int sum(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static double sum(double[] array){
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	//-----------------------------------------------
	public static int average(int[] array){
		return sum(array)/array.length;
	}
	public static double average(double[] array){
		return sum(array)/array.length;
	}	
	//-----------------------------------------------
	public static void printArray(int[] array){
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length-1] + ".");
	}
	public static void printArray(double[] array){
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length-1] + ".");
	}
	public static void printArray(double[] array, boolean strip){
		for (int i = 0; i < array.length-1; i++) {
			System.out.printf("%.2f, ", array[i]);
		}
		System.out.printf("%.2f.\n", array[array.length-1]);
	}
	//-----------------------------------------------
	public static void sortArray(double[] array){
		for (int i = 0; i < array.length-1; i++) {
			boolean finished = true;
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					double tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					finished = false;
				}
			}
			if (finished) {
				//System.err.println("Looped " + i + " to sort list.");
				break;
			}
		}
	}
	public static void sortArray(int[] array){
		for (int i = 0; i < array.length-1; i++) {
			boolean finished = true;
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					finished = false;
				}
			}
			if (finished) {
				//System.err.println("Looped " + i + " to sort list.");
				break;
			}
		}
	}
	public static void sortArray(char[] array){
		for (int i = 0; i < array.length-1; i++) {
			boolean finished = true;
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					char tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					finished = false;
				}
			}
			if (finished) {
				//System.err.println("Looped " + i + " to sort list.");
				break;
			}
		}
	}
	//-----------------------------------------------
	public static int binarySearch(double[] array, int number){
		sortArray(array);
		int min = 1;
		int max = array.length - 1;
		int index = 0;
		while (max >= min) {
			index = (min + max) / 2;
			if (number < array[index]) {
				max = index - 1;
			}else if (number == array[index]) {
				break;
			}else {
				min = index + 1;
			}
		}
		return index;
	}
	public static int binarySearch(int[] array, int number){
		sortArray(array);
		int min = 1;
		int max = array.length - 1;
		int index = 0;
		while (max >= min) {
			index = (min + max) / 2;
			if (number < array[index]) {
				max = index - 1;
			}else if (number == array[index]) {
				break;
			}else {
				min = index + 1;
			}
		}
		return index;
	}
	//-----------------------------------------------
	public static int[] generateRandom(int howMany, int from, int to){
		int[] array = new int[howMany];
		for (int i = 0; i < array.length; i++) {
			array[i] = from + (int)(Math.random() * (to - from));
		}
		return array;
	}
	public static double[] generateRandom(int howMany, double from, double to){
		double[] array = new double[howMany];
		for (int i = 0; i < array.length; i++) {
			array[i] = from + (Math.random() * (to - from));
		}
		return array;
	}
	//-----------------------------------------------
	public static boolean equals(int[] array1, int[] array2){
		for (int i = 0; i < array2.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean equals(double[] array1, double[] array2){
		for (int i = 0; i < array2.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	//-----------------------------------------------
	public static int elementsBelow(int[] array, int number){
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < number) {
				index++;
			}else {
				break;
			}
		}
		return index;
		
	}
	public static int elementsBelow(double[] array, double number){
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < number) {
				index++;
			}else {
				break;
			}
		}
		return index;
	}
	//-----------------------------------------------
	public static double[] reverse(double[] array){
		double[] tempArray = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[array.length-i-1];
		}
		return tempArray;
	}
	public static int[] reverse(int[] array){
		int[] tempArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[array.length-i-1];
		}
		return tempArray;
	}
	//-----------------------------------------------
	public static void printOccursSame(int[] array){
		int howMany = 1;
		String oneOrMore = "put";
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i-1]) {
				System.out.printf("Broj %d se javlja %d %s.\n", array[i-1], howMany, oneOrMore);
				howMany = 1;
				oneOrMore = "put";
			}else {
				howMany++;
				oneOrMore = "puta";
			}
			if ((i+1) == array.length) {
				System.out.printf("I broj %d se javlja %d %s.\n", array[i-1], howMany, oneOrMore);
			}
		}
	}
	public static void printOccursSame(double[] array){
		int howMany = 1;
		String oneOrMore = "put";
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i-1]) {
				System.out.printf("Broj %.2f se javlja %d %s.\n", array[i-1], howMany, oneOrMore);
				howMany = 1;
				oneOrMore = "put";
			}else {
				howMany++;
				oneOrMore = "puta";
			}
			if ((i+1) == array.length) {
				System.out.printf("I broj %.2f se javlja %d %s.\n", array[i-1], howMany, oneOrMore);
			}
		}
	}
	//-----------------------------------------------
}
