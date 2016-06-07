
public class RandomFiveDimension {

	public static void main(String[] args) {
		int[][][][][] matrix = new int[5][5][5][5][5];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				for (int j2 = 0; j2 < matrix.length; j2++) {
					for (int k = 0; k < matrix.length; k++) {
						for (int k2 = 0; k2 < matrix.length; k2++) {
							matrix[i][j][j2][k][k2] = (int)(Math.random() * 10);
						}
					}
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				for (int j2 = 0; j2 < matrix.length; j2++) {
					for (int k = 0; k < matrix.length; k++) {
						for (int k2 = 0; k2 < matrix.length; k2++) {
							System.out.print(matrix[i][j][j2][k][k2] + " ");
						}
						System.out.print(", ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("------------------------------------------");
			System.out.println();
		}
		
	}

}
