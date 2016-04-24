/**
 * @autor AonoZan Dejan Petrovic 2016
 */
public class _1_SumColumns {
	public static java.util.Scanner unos = new java.util.Scanner(System.in);
	public static void closeScanner(){unos.close();};
	public static void inputArray(double[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = unos.nextDouble();
			}
		}
	}
	public static void sumCol(double[][] array){
		for (int i = 0; i < array[0].length; i++) {
			double sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum+=array[j][i];
			}
			System.out.printf("Sum of elements at column %d is: %.3f.\n", i, sum);
		}
	}
	public static void main(String[] args) {
		double[][] array = new double[3][4];
		System.out.println("Enter 3x4 matrix: ");
		inputArray(array);
//		Inputs.genRand(array, 0, 10);
//		Inputs.printArray(array, true);
		sumCol(array);
	}

}
