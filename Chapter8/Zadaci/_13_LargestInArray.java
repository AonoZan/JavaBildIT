/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _13_LargestInArray {
	public static int[] locateLargest(double[][] array){
		int[] largestElement = new int[2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > array[largestElement[0]][largestElement[1]]) {
					largestElement[0] = i;
					largestElement[1] = j;
				}
			}
		}
		return largestElement;
	}
	public static void main(String[] args) {
		System.out.print("Enter number of rows and columns for array: ");
		int row = Inputs.input.nextInt();
		int col = Inputs.input.nextInt();
		Inputs.closeScanner();
		double[][] array = new double[row][col];
		Inputs.inputArray(array);
//		Inputs.genRand(array, 0, 10);
//		Inputs.printArray(array, true);
		int[] positionOfLargest = locateLargest(array);
		System.out.printf("The location of the largest element is at (%d, %d)", positionOfLargest[0], positionOfLargest[1]);
	}

}
