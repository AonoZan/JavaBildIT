/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _16_SortRowsColumns {
	public static void sortRows(int[][] array){
		for (int i = 0; i < array.length; i++) {
			boolean finished = true;
			for (int j = 0; j < array[0].length-1; j++) {
				for (int j2 = 0; j2 < array[0].length-1-j; j2++) {
					if (array[i][j2] > array[i][j2 + 1]) {
						int tmp = array[i][j2];
						array[i][j2] = array[i][j2 + 1];
						array[i][j2 + 1] = tmp;
						finished = false;
					}
				}
				if (finished) break;
			}
		}
	}
	public static void sortColumns(int[][] array){
		for (int i = 0; i < array[0].length; i++) {
			boolean finished = true;
			for (int j = 0; j < array.length-1; j++) {
				for (int j2 = 0; j2 < array.length-1-j; j2++) {
					if (array[j2][i] > array[j2 + 1][i]) {
						int tmp = array[j2][i];
						array[j2][i] = array[j2 + 1][i];
						array[j2 + 1][i] = tmp;
						finished = false;
					}
				}
				if (finished) break;
			}
		}
	}
	public static void main(String[] args) {
		int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {1, 1}};
		System.out.println("Unsorted: ");
		Inputs.printArray(array);
		sortRows(array);
		System.out.println("Sorted rows: ");
		Inputs.printArray(array);
		sortColumns(array);
		System.out.println("Sorted columns: ");
		Inputs.printArray(array);
	}

}
