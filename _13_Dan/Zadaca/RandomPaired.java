
public class RandomPaired {
	public static void main(String[] args){
		int[] intArray = Custom.generateRandom(20, 0, 100);
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}
	}
}