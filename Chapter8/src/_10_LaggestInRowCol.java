
public class _10_LaggestInRowCol {
	public static void genRandom(int[][] array, int from, int to){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = from + (int)(Math.random() * (to-from+1));
			}
		}
	}
	public static int[] largestRowCol(int[][] array){
		int[] rowColIndex = new int[2];
		int lrgRow = 0;int lrgCol = 0;
		for (int i = 0; i < array.length; i++) {
			int row = 0;int col = 0;
			for (int j = 0; j < array[i].length; j++) {
				row+=array[i][j];
				col+=array[j][i];
				if (row > lrgRow) {
					lrgRow = row;
					rowColIndex[0] = i;
				}
				if (col > lrgCol) {
					lrgCol = col;
					rowColIndex[1] = i;
				}
			}
		}
		return rowColIndex;
	}
	public static void main(String[] args) {
		int[][] array = new int[6][6];
		genRandom(array, 0, 1);
		Inputs.printArray(array);
		int[] lrgRowColIndex = largestRowCol(array);
		System.out.printf("The largesr row index: %d.\nthr largest column: %d.", lrgRowColIndex[0], lrgRowColIndex[1]);
	}

}
