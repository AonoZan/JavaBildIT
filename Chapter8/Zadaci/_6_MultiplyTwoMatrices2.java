/**
 * @autor AonoZan Dejan Petrovic 2016
 */
public class _6_MultiplyTwoMatrices2 {
	public static java.util.Scanner unos = new java.util.Scanner(System.in);
	public static void closeScanner(){unos.close();};
	public static void inputArray(double[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = unos.nextDouble();
			}
		}
	}
	public static double[][] addTwo(double[][] array1, double[][] array2){
		double[][] newArray = new double[array1.length][array1[0].length];
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = array1[i][j] * array2[i][j];
			}
		}
		return newArray;
	}
	public static void printAddArray(double[][] array1, double[][] array2, double[][] arraySum){
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length + array2[i].length + arraySum[i].length; j++) {
				String fix = "    ";
				if (j<array1[i].length) {
					System.out.printf("%.2f", array1[i][j%3]);
				}else if (j<array1[i].length+array2[i].length) {
					if (j == array1[i].length) {if (i == 1) {fix = " *  ";}System.out.print(fix);}
					System.out.printf("%.2f", array2[i][j%3]);
				}else {
					if (j == array1[i].length+array2[i].length) {if (i == 1) {fix = " =  ";}System.out.print(fix);}
					System.out.printf("%.2f", arraySum[i][j%3]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
//		double[][] matrix1 = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9},
//		};
//		double[][] matrix2 = {
//				{0, 2, 4},
//				{1, 4.5, 2.2},
//				{1.1, 4.3, 5.2},
//		};
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		System.out.print("Enter matrix1: ");
		inputArray(matrix1);
//		Inputs.genRand(matrix1, 0, 10);
		System.out.print("Enter matrix2: ");
		inputArray(matrix2);
//		Inputs.genRand(matrix2, 0, 10);
		double[][] sumArray = addTwo(matrix1, matrix2);
//		Inputs.printArray(sumArray);
		System.out.println("The multiplication of the matrices is");
		printAddArray(matrix1, matrix2, sumArray);
	}

}
