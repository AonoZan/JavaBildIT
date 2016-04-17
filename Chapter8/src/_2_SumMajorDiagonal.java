
public class _2_SumMajorDiagonal {
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
		double sum = 0;
		for (int i = 0; i < array[0].length; i++) {
			sum+=array[i][i];
		}
		System.out.printf("Sum of elements at major diadonal is: %.3f.\n", sum);
	}
	public static void main(String[] args) {
		double[][] array = new double[4][4];
		System.out.println("Enter 4x4 matrix: ");
		inputArray(array);
//		Inputs.genRand(array, 0, 10);
//		Inputs.printArray(array, true);
		sumCol(array);
	}

}
