
public class TwoDimensionRandom {
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
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite broj redova i broj kolona: ");
		int brojRedova = input.nextInt();
		int brojKolona = input.nextInt();
		input.close();
		int[][] matrix = randTwoDimension(brojRedova, brojKolona);
		System.out.println(matrix);
	}

}
