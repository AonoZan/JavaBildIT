public class _7_RowSorting {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
	public static void inputArray(double[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
	}
	public static double[][] sort(double[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				boolean finished = true;
				for (int k = 0; k < array.length - 1 - j; k++) {
					if (array[i][k] > array[i][k + 1]) {
						double tmp = array[i][k];
						array[i][k] = array[i][k + 1];
						array[i][k + 1] = tmp;
						finished = false;
					}
				}
				if (finished) {
					break;
				}
			} 
		}
		return array;
	}
	public static void printArray(double[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length-1; k++) {
				System.out.printf("%.3f, ", array[i][k]);
			}
			System.out.printf("%.3f.\n", array[i][array[i].length-1]);
		}
	}
	public static void main(String[] args) {
		double[][] array = new double[3][3];
		System.out.print("Enter the 3x3 array: ");
		inputArray(array);
		closeScanner();
		double[][] newArray = sort(array);
		printArray(newArray);
	}
}
