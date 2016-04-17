public class _4_NewDouble {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
	public static void inputArray(double[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
	}
	public static void randFill(double[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.random() * 10;
				System.out.printf("%5.2f ", array[i][j]);
			}
			System.out.println();
		}
	}
	public static void findLargest(double[][] array){
		double largest = 0;
		int x = 0; int y = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (largest < array[i][j]) {
					largest = array[i][j];
					x = i;y = j;
				}
			}
		}
		System.out.printf("The location of the largest element is at(%d, %d).", x, y);
	}
	public static void main(String[] args) {
		System.out.print("Enter number of rows and columns: ");
		double[][] array = new double[input.nextInt()][input.nextInt()];
		System.out.printf("Enter the array: \n");
		//randFill(array);
		inputArray(array);
		findLargest(array);
	}
}
