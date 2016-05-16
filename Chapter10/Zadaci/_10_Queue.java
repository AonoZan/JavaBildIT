/**@autor AonoZan Dejan Petrovic 2016 ©
 */
/*UML
 * 		Queue
 *  - elements: int[]
 *  - size: int;
 *  
 *  Queue()
 *  Queue(int size)
 *  
 *  + enqueue(int v): void
 *  + dequeue(): int
 *  + empty(): boolean
 *  + getSize(): int
 */

public class _10_Queue {
	int[] elements;
	int size = 0;
	
	_10_Queue() {
		this(8);
	}
	_10_Queue(int size) {
		elements = new int[size];
	}
	
	public void enqueue(int v) {
		if (this.size >= elements.length) {
			manageArray(true);
		}
		elements[this.size++] = v;
	}
	private int manageArray(boolean operation){
		int[] tmp;
		int i = 0;
		if (operation) {
			tmp = new int[elements.length * 2];
			System.arraycopy(elements, 0, tmp, 0, elements.length);
		}else{
			tmp = new int[elements.length - 1];
			System.arraycopy(elements, 1, tmp, 0, elements.length-1);
			i = elements[--this.size-this.size];
		}
		elements = tmp;
		return i;
	}
	public int dequeue() {
		return manageArray(false);
	}
	public boolean empty() {
		return this.size == 0;
	}
	public int getSize() {
		return this.size;
	}
}
