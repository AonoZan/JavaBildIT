
public class SortWithIndexes {
	
	public static void main(String[] args) {
		int[] array = {50, 89, 36};
		for (int i = 0; i < array.length-1; i++) {
			int index = 0;
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[i] > array[i+1]) {
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					index = i;
				}else {
					index = j;
				}
			}
			System.out.printf("%d[%d],\n", array[array.length-1-i], index);
		}
	}

}
