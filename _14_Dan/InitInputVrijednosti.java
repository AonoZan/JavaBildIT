
public class InitInputVrijednosti {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.printf("Unesite %d redova i %d kolone: ", matrix.length, matrix[0].length);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}
			
		}
		input.close();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
