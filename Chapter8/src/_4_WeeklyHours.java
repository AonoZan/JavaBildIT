public class _4_WeeklyHours {
	public static int sum(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static void sort(int[][] array){
		for (int i = 0; i < array.length-1; i++) {
			boolean finished = true;
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j][0] < array[j+1][0]) {
					int[] tmp = array[j];
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
	public static void printStats(int[][] array){
		int[][] sumOfHours = new int[array.length][2];
		for (int i = 0; i < array.length; i++) {
			sumOfHours[i][0] = sum(array[i]);
			sumOfHours[i][1] = i+1;
		}
		sort(sumOfHours);
		for (int i = 0; i < sumOfHours.length; i++) {
			System.out.printf("Employee%d have worked %dh.\n",sumOfHours[i][1], sumOfHours[i][0]);
		}
	}
	public static void main(String[] args) {
		int[][] employeeHours = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 8}};
		printStats(employeeHours);
		}
}