public class SumOfTwoDimensionElem {
	public static int[][] sumTwoDimension(int[][] array1, int[][] array2){
		int[][] newArray = new int[array1.length][array1[0].length];
		if (array1.length != array2.length) {
			System.out.println("Arrays are not exact length.");
			return newArray;
		}
		
		for (int i = 0; i < newArray.length; i++) {
			if (array1[0][i] != array2[0][i]) {
				System.out.printf("Arrays at %d index are not exact length.", i);
				break;
			}
			for (int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = array1[i][j] +array2[i][j];
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[][] matrix1 = new int[2][2];
		int[][] matrix2 = new int[2][2];
		
		System.out.println("Unesite prvi niz: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				matrix1[i][j] = input.nextInt();
			}
		}
		System.out.println("Unesite drugi niz: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				matrix2[i][j] = input.nextInt();
			}
		}
		input.close();
		int[][] matrixMixed = sumTwoDimension( matrix1,  matrix2);
		
		for (int i = 0; i < matrixMixed.length; i++) {
			for (int j = 0; j < matrixMixed[i].length; j++) {
				System.out.print(matrixMixed[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
