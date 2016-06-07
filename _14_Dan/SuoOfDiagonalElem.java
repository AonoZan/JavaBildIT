
public class SuoOfDiagonalElem {

	public static void main(String[] args) {
		int[][] matrix = TwoDimensionRandom.randTwoDimension(3, 3);
		//int[][] matrix = {{1, 2}, {3, 4}};
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		System.out.println("Sum of diagonal = " + sum);
	}

}
