public class LowestInDouble {
	public static void main(String[] args){
		System.out.println("Unesite deset decimalnih brojeva(0 prekida unos): ");
		double[] doubleArray = Custom.takeInput(10.0);
		Custom.sortArray(doubleArray);
		System.out.println( "Najmanji u nizu je: " + doubleArray[0]);
	}
}