/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class LocationTest {
	public static Location locateLargest(double[][] a) {
		Location maxInArray = new Location(a);
		return maxInArray;
	}
	public static void main(String[] args) {
		System.out.print("Enter number of rows and columns: ");
		int row = Inputs.input.nextInt();
		int col = Inputs.input.nextInt();
		
		double[][] array = new double[row][col];
		System.out.println("Enter values for array:");
		Inputs.inputArray(array);
		
		Location arrayLargest = locateLargest(array);
		
		System.out.printf("Largest in array:\n"
				+ "\trow: %d\n"
				+ "\tcolumn: %d\n"
				+ "\tvalue: %.2f\n",
				arrayLargest.row,
				arrayLargest.column,
				arrayLargest.maxValue);
	}

}
