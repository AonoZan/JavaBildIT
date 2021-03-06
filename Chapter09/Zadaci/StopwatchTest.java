/**@autor AonoZan Dejan Petrovic 2016 �
 */

public class StopwatchTest {

	public static void main(String[] args) {
		Stopwatch watch = new Stopwatch();
		
		int[] numbers = new int[100000];
		Inputs.genRand(numbers, 0, 100);
		
		watch.start();
		
		for (int i = 0; i < numbers.length-1; i++) {
			boolean finished = true;
			for (int j = 0; j < numbers.length-1-i; j++) {
				if (numbers[j] > numbers[j+1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
					finished = false;
				}
			}
			if (finished) break;
		}
		
		watch.stop();
		System.out.printf("Elapsed time is: %.2fsec.", (watch.getElapsedTime()/1000.0));
		
//		Inputs.printArray(numbers);
		
	}

}
