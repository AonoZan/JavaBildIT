public class AboveBelowAverage {
	public static void main(String[] args) {
		System.out.print("Unesite nekoliko brojeva(0 prekida unos, maksimalno do 100): ");
		int[] array = Custom.takeInput(100);
		//int[] array = Custom.generateRandom(10, 0, 10);
		Custom.closeScanner();
		//Custom.printArray(array);
		Custom.sortArray(array);
		//System.out.println("average " + Custom.average(array));
		int averageInList = Custom.elementsBelow(array, Custom.average(array));
		Custom.printArray(array);
		System.out.printf("\nBrojeva ispod prosjeka u nizu ima %d, a iznad %d.", averageInList, (array.length - averageInList));
	}
}
