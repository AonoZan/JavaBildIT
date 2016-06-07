public class RandomArray {
	public static void generateRandomArray(int[] allNums, int from, int to){
		for (int i = 0; i < allNums.length; i++) {
			allNums[i] = from + (int)(Math.random() * (to - from));
		}
	}
	public static void printOnly(int[] allNums){
		for (int i = 0; i < allNums.length; i++) {
			if (allNums[i] % 2 == 0) {
				System.out.print(allNums[i] + " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = new int[20];
		generateRandomArray(array, 0, 100);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		printOnly(array);
	}

}
