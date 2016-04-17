
public class _5_EvenRow {
	public static void randFill(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	public static int sum(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static void print(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.printf("%d, ", array[i][j]);
			}
			System.out.printf("%d.\n", array[i][array[i].length-1]);
		}
	}
	public static void checkIfEven(int[][] array){
		int compareTo = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = sum(array[i]);
			if (compareTo != sum && compareTo != 0) {
				System.out.println("Columns and rows are not equal.");
				return;
			}else if (compareTo == 0) {
				compareTo = sum;
			}
		}
		System.out.println("Columns and rows are equal.");
	}
	public static void main(String[] args){
		int[][] array = new int[6][6];
		randFill(array);
		//print(array);
		checkIfEven(array);
	}
}
