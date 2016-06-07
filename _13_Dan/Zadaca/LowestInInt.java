public class LowestInInt {
	public static void main(String[] args){
		System.out.println("Unesite deset brojeva(0 prekida unos): ");
		int[] intArray = Custom.takeInput(10);
		Custom.sortArray(intArray);
		System.out.println( "Najmanji u nizu je: " + intArray[0]);
	}
}