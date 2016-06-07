import java.util.Scanner;

public class Tests {
	public static double[] testVariableLength(String words, double... numbers) {
		return numbers;
	}

	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}

		double result = numbers[0];

		for (int i = 1; i < numbers.length; i++)
			if (numbers[i] > result)
				result = numbers[i];

		System.out.println("The max value is " + result);
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		/*int x = 30;
		int[] numbers = new int[x];
		
		x = 60;
		System.out.println(x + "  " + numbers.length);*/
		
		/*String[] strings = {"asdasd", "asdfsdf"};
		int i[] = {3, 4, 3, 2};
		System.out.println(i);*/
		
		/*// Create an array to hold  10 double values.
		//double[] array = new double[10];
		double[] array = { 3.5, 5.5, 4.52, 1.6};
		//Assign the value  5.5 to the last element in the array.
		array[1] = 5.5;
		//Display the sum of the first two elements.
		System.out.println("The sum of first two items is " + (array[0] + array[1]));
		// Write a loop that computes the sum of all elements in the array.
		double sumOfAllEleents = 0.0;
		for (int i = 0; i < array.length; i++) {
			sumOfAllEleents+=array[i];
		}
		// Write a loop that finds the minimum element in the array.
		double lowestElement = sumOfAllEleents;
		int indexOfLowestElemment = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < lowestElement) {
				lowestElement = array[i];
				indexOfLowestElemment = i;
			}
		}
		// Randomly generate an index and display the element of this index in the array.
		int randmIndex = (int)(Math.random() * array.length - 1);
		// Use an array initializer to create another array with the initial values 3.5, 5.5, 4.52, and 5.6.
		double[] initializedArray = { 3.5, 5.5, 4.52, 5.6};
		System.out.println(sumOfAllEleents + ", " + lowestElement + "[" + indexOfLowestElemment + "], ");*/
		int[] nums = {1, 2, 3};
		int[] nums2 = new int[nums.length+1];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}
		nums = nums2;
		System.out.println(nums2[3]);
		
		nums2 = new int[nums.length+1];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}
		nums = nums2;
		System.out.println(nums[4]);
		
		
		
		unos.close();
	}

}
