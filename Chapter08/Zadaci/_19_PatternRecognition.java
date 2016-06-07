/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _19_PatternRecognition {
	public static void recognize(int[][] array, boolean[][] matches, int howMany){
		for (int i = 0; i < array[0].length; ) {
			for (int j = i; j < array.length; j++) {
				System.out.print(array[j][j]);
			}
			break;
		}
	}
	public static void main(String[] args) {
		int[][] array = {
				{0, 1, 0, 3, 1, 6, 1},
				{0, 1, 6, 8, 6, 0, 1},
				{5, 6, 2, 1, 6, 2, 9},
				{6, 5, 6, 6, 1, 9, 1},
				{1, 3, 6, 1, 4, 0, 7},
				{3, 6, 3, 3, 4, 0, 7}};
		boolean[][] matches = new boolean[array.length][array[0].length];
		matches[5][1] = true;
		matches[4][2] = true;
		matches[3][3] = true;
		matches[2][4] = true;
		recognize(array, matches, 4);
		/*
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (matches[i][j]) {
					System.out.printf("[%2d] ", array[i][j]);
				}else {
					System.out.printf(":%2d: ", array[i][j]);
				}
			}
			System.out.println();
		}
		*/
	}

}
