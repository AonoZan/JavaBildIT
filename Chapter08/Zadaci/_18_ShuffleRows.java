/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _18_ShuffleRows {
	public static void shuffle(int[][] array){
		for (int i = 0; i < array.length; i++) {
			int[] tmp = array[i];
			int randIndex = (int)(Math.random() * array.length);
			array[i] = array[randIndex];
			array[randIndex] = tmp;
		}
	}
	
	public static void main(String[] args) {
		int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		Inputs.printArray(array);
		shuffle(array);
		Inputs.printArray(array);
	}
}
