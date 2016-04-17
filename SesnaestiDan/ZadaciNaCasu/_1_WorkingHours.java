
public class _1_WorkingHours {
	public static int sum(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static void printStats(int[][] array){
		int[] sumOfHours = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sumOfHours[i] = sum(array[i]);
		}
		
		for (int i = 0; i < sumOfHours.length-1; i++) {
			int employee = 0;
			for (int j = 0; j < sumOfHours.length-1-i; j++) {
				
				if (sumOfHours[j] > sumOfHours[j+1]) {
					int tmp = sumOfHours[j];
					sumOfHours[j] = sumOfHours[j+1];
					sumOfHours[j+1] = tmp;
					employee = i;
				}else {
					employee = j;
				}
			}
			System.out.printf("Employee%d have worked %dh.\n", employee+1 ,sumOfHours[sumOfHours.length-1-i]);
		}
	}
	public static void main(String[] args) {
		int[][] employeeStats = {
				{5, 2, 4, 2020, 2, 5, 4},
				{5, 5, 4, 7, 2, 5, 4},
				{2, 4, 4, 2, 2, 5, 3},
				{5, 5, 4, 7, 2, 3, 4},
				{5, 5, 4, 2, 2, 5, 4},
				{5, 2, 4, 7, 2, 4, 3},
				{3, 5, 4, 7, 2, 2, 4},
				{5, 5, 4, 7, 2, 5, 4}};
		printStats(employeeStats);
	}

}
