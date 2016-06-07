
public class BiggestDoubleInArray {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void inputArray(double[] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
	}
	public static double[] sort(double[] array){
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
				break;
			}
		}
		return array;
	}
	public static void printArray(double[] array){
		for (int i = 0; i < array.length; i++) {
				System.out.printf("%f, ", array[i]);
		}
		System.out.printf("%f.\n", array[array.length-1]);
	}
	public static void main(String[] args) {
		//double[] array = {0.5,0.1,0.6,0.2};
		double[] array = new double[10];
		System.out.print("Unesite 10 decimalnih brojeva: ");
		inputArray(array);
		array = sort(array);
		//printArray(array);
		System.out.printf("Najveci u nizu je %.2f.", array[array.length-1]);
	}
}
