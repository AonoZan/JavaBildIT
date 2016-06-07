
public class _3_ShuffleInt {
	public static void shuffle(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int firstIndex = (int)(Math.random() * array.length);
				int secondIndex = (int)(Math.random() * array[firstIndex].length);
				int tmp = array[i][j];
				array[i][j] = array[firstIndex][secondIndex];
				array[firstIndex][secondIndex] = tmp;
			}
		}
	}
	public static void print(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.printf("%d, ", array[i][j]);
			}
			System.out.printf("%d.\n", array[i][array[i].length-1]);
		}
	}
	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10},};
		shuffle(m);
		print(m);
		
	}

}
