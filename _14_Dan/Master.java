public class Master {
	public static int[][] randTwoDimension(int brojRedova, int brojKolona){
		int[][] matrix = new int[brojRedova][brojKolona];
		
		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojKolona; j++) {
				matrix[i][j] = (int)(Math.random() * 10);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		return matrix;
	}
	public static int[] genRandom(int howMany, int from, int to) {
		int[] array = new int[howMany];
		for (int i = 0; i < howMany; i++) {
			array[i] = from + (int)(Math.random() * (to - from));
		}
		return array;
	}
	public static void sort(int[] array) {
		boolean finished = true;
		for (int i = 0; i < array.length - 1; i++) {
			finished = true;
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
	public static void printArray(int[] array){
		for (int i = 0; i < array.length-1; i++) {
			System.out.printf("%d, ", array[i]);
		}
		System.out.printf("%d.\n", array[array.length-1]);
	}

	}
