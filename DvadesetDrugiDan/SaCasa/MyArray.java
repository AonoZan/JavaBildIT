/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class MyArray {
	private int[] array;
	
	MyArray(int[] array) {
		this.array = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			this.array[i] = array[i];
		}
	}
	
	public int getSmallestElement() {
		int smallest = sum();
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] < smallest) smallest = this.array[i];
		}
		return smallest;
	}
	public int getLargestElement() {
		int largest = 0;
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] > largest) largest = this.array[i];
		}
		return largest;
	}
	public int sum() {
		int sum = 0;
		for (int i = 0; i < this.array.length; i++) {
			sum += this.array[i];
		}
		return sum;
	}
	public void printAllElements() {
		System.out.printf("Printing array with %d elements.\n", this.array.length);
		for (int i = 0; i < this.array.length - 1; i++) {
			System.out.printf("%d, ", this.array[i]);
		}
		System.out.printf("%d.\n", this.array[this.array.length-1]);
	}
}
;