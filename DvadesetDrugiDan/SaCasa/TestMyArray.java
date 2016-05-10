/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestMyArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		Inputs.genRand(array, 0, 10);
		
		MyArray myArray = new MyArray(array);
		
		myArray.printAllElements();
		
		System.out.println(myArray.getLargestElement());
		System.out.println(myArray.getSmallestElement());
	}

}
