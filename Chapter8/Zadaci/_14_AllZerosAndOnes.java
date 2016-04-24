/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _14_AllZerosAndOnes {
	public static void exploreArray(int[][] array){
		boolean noSameOnRow = true;
		boolean noSameOnCol = true;
		
		for (int i = 0; i < array.length; i++) {
			int rowNum = array[i][0];
			int colNum = array[0][i];
			for (int j = 0; j < array.length; j++) {
				if (rowNum != array[i][j]) rowNum = -1; 
				if (colNum != array[j][i]) colNum = -1; 
			}
			if (rowNum != -1) {System.out.printf("All %ds on row %d.\n", rowNum, i); noSameOnRow = false;}
			if (colNum != -1) {System.out.printf("All %ds on col %d.\n", colNum, i); noSameOnCol = false;}
			
		}
		if (noSameOnRow) System.out.println("No same number on rows.");
		if (noSameOnCol) System.out.println("No same number on columns.");
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of array: ");
		int sizeOfArray = Inputs.input.nextInt();
		Inputs.closeScanner();
		int[][] array = new int[sizeOfArray][sizeOfArray];
		Inputs.genRand(array, 0, 2);
		Inputs.printArray(array);
		exploreArray(array);
	}

}
