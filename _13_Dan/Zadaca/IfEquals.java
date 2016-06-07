public class IfEquals {
	public static void main(String[] args) {
		System.out.print("Unesite prvi niz od 5 elemenata: ");
		int[] array1 = Custom.takeInput(5);
		System.out.printf("\nUnesite drugi niz od 5 elemenata: ");
		int[] array2 = Custom.takeInput(5);
		//Custom.sortArray(array1);
		//Custom.sortArray(array1);
		System.out.printf("\nNizovi su jednaki [%b]", array1, array2);
		Custom.closeScanner();
	}

}
