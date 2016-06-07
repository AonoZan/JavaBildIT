
public class ReversedSortedInput {

	public static void main(String[] args) {
		System.out.print("Unesite prvi niz od 5 elemenata: ");
		//int[] array = Custom.takeInput(10);
		int[] array = Custom.generateRandom(10, 0, 100);
		Custom.printArray(array);
		Custom.sortArray(array);
		Custom.printArray(array);
		array = Custom.reverse(array);
		Custom.printArray(array);
	}

}
