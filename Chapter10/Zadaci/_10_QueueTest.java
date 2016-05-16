/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _10_QueueTest {

	public static void main(String[] args) {
		_10_Queue queue = new _10_Queue();
		
		for (int i = 0; i < 20; i++) {
			queue.enqueue((int)(Math.random() * 20));
		}
//		for (int x : queue.elements) {
//			System.out.println(x);
//		}
		System.out.println();
		for (int i = queue.getSize(); i > 0 ; i--) {
			System.out.println(queue.getSize() + " " + queue.dequeue());
		}
	}

}
