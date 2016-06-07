public class CountsameInArray {
	public static void main(String[] args) {
		System.out.print("Unesite deset cijelih brojeva(nula prekida unos): ");
		int[] array = Custom.takeInput(10);
		//int[] array = Custom.generateRandom(10, 0, 10);
		Custom.sortArray(array);
		Custom.printArray(array);
		Custom.printOccursSame(array);
	}
}
