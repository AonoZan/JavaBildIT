
public class _9_ {
	public static void sort(int[] array){
		for (int i = 0; i < array.length-1; i++) {
			boolean finished = true;
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					finished = false;
				}
			}
			if (finished) {
				break;
			}
		}
	}
	public static boolean inRang(int[] array){
		for (int i = 2; i < array.length; i++) {
//			System.out.println(array[i-2] +" " + array[i-1] + " " + array[i]);
			if (array[i-2]+2 == array[i] && array[i-1]+1 == array[i]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] array = new int[10];
		Inputs.genRandom(array, 1, 10);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		sort(array);
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
		System.out.println(inRang(array));
		
	}

}
