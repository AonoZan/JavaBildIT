
public class _6_StrictlyIdentical {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
	public static void inputArray(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}
	}
	public static boolean equals(int[][] m1, int[][] m2){
		if (m1.length == m2.length) {
			for (int i = 0; i < m2.length; i++) {
				if (m1[i].length == m2[i].length) {
					for (int j = 0; j < m1[i].length; j++) {
						if (m1[i][j] != m2[i][j]) {
							return false;
						}
					}
				}
			}
		}else {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		System.out.printf("Enter the 3x3 array: \n");
		inputArray(m1);
		System.out.printf("Enter the second 3x3 array: \n");
		inputArray(m2);
		System.out.printf("Two arrays are identical(%b).", equals(m1, m2));

	}

}
