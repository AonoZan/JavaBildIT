public class _8_ColSorting {
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
			for (int j = 0; j < array.length-1; j++) {
				boolean finished = true;
				for (int k = 0; k < array.length-1-j; k++) {
					if (array[k][i] < array[k+1][i]) {
						double tmp = array[k][i];
						array[k][i] = array[k+1][i];
						array[k+1][i] = tmp;
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
				System.out.printf("%.1f, ", array[i][k]);
			}
			System.out.printf("%.1f.\n", array[i][array[i].length-1]);
		}
	}
	public static void main(String[] args) {
		double[][] array = new double[3][3];
		System.out.println("Enter the 3x3 array: ");
		inputArray(array);
		closeScanner();
//		double[][] array = {  {1.2, 9, 3}
//							, {8, 5.5, 1.6}
//							, {5, 1.8, 6}};
		double[][] newArray = sort(array);
		printArray(newArray);
	}
}
