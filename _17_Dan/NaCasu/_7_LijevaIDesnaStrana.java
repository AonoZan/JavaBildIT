
public class _7_LijevaIDesnaStrana {
	public static boolean ifPalindrom(int[] array){
		int reminder = array.length % 2;
		for (int i = 0; i < array.length/2+reminder; i++) {
			if (array[i] != array[array.length-1-i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Unesite duzinu niza: ");
		int arrayLength = Inputs.input.nextInt();
		System.out.println("Unesite elemente niza: ");
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = Inputs.input.nextInt();
		}
		boolean ifPalndrom = ifPalindrom(array);
		System.out.println(ifPalndrom);
	}

}
