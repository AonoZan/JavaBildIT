
public class HigherToLower {

	public static void main(String[] args) {
		int[] array = Custom.generateRandom(10, 0, 100);
		Custom.sortArray(array);
		Custom.printArray(array);
		array = Custom.reverse(array);
		Custom.printArray(array);

	}

}
