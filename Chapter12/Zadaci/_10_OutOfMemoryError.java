/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _10_OutOfMemoryError {
	public static void addNumToArray(int[] array, int index, int number) throws OutOfMemoryError{
		if(index >= array.length) throw new OutOfMemoryError("Out of memory");
		array[index] = number;
	}
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int index = 0; index <= array.length; index++) {
			try {
				addNumToArray(array, index, 5);
			} catch (OutOfMemoryError e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(array[9]);
	}

}
class OutOfMemoryError extends Exception{
	private static final long serialVersionUID = 1L;

	OutOfMemoryError(String message){
		super(message);
	}
}
