public class ProsjekNiza {
	public static void main(String[] args){
		System.out.println("Unesite deset brojeva(0 prekida unos): ");
		int[] intArray = Custom.takeInput(10);
		int average = Custom.average(intArray);
		System.out.println( "Prosjek je: " + average);
	}
}
