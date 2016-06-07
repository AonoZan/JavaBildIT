
public class SumOfThreeDimensionArray {
	public static void main(String[] args){
		int[][] matrix = new int[3][3];
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int)(Math.random() * 10);
				sum += matrix[i][j];
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of whole array = " + sum + ". And average is = " + (sum/ (matrix.length*matrix[0].length)) + ".");
		
	}
}
