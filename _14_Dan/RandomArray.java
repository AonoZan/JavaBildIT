
public class RandomArray {

	public static void main(String[] args) {
		int[] array = Master.genRandom(20, 0, 10);
		Master.printArray(array);
		Master.sort(array);
		Master.printArray(array);
	}

}
