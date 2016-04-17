public class _2_LargestInRow {
	public static int sum(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static void randFill(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	public static void largSmall(int[][] array){
		int row = 0;int col = 0;
		int rowIndex = 0;int colIndex = 0;
		for (int i = 0; i < array.length; i++) {
			int x = sum(array[i]);
			int y = 0;
			for (int j = 0; j < array.length; j++) {
				y += array[j][i];
			}
			if (row < x) {
				row = x;
				rowIndex = i;
			}
			if (col < y) {
				col = y;
				colIndex = i;
			}
		}
		System.out.printf("Largest row is %d, and collumn id %d.\n", rowIndex, colIndex);
	}
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		randFill(array);
		largSmall(array);
	}

}
