import java.util.Scanner;

public class ArrayIndexOf {
	public static int[] sortList(int[] allNums){
		for (int i = 0; i < allNums.length-1; i++) {
			int currentSmallest = allNums[i];
			int indexOfSmallest = i;
			for (int j = i + 1; j < allNums.length; j++) {
				if (currentSmallest > allNums[j]) {
					currentSmallest = allNums[j];
					indexOfSmallest = j;
				}
			}
			if (indexOfSmallest != i) {
				allNums[indexOfSmallest] = allNums[i];
				allNums[i] = currentSmallest;
			}
		}
		return allNums;
	}
	public static int smallest(int[] allNums){
		int lowestInArray = LowestInArray.lowestInt(allNums);
		int indexOfsmallest = 0;
		for (int i = 0; i < allNums.length; i++) {
			if (allNums[i] == lowestInArray ) {
				indexOfsmallest = i;
			}
		}
		return indexOfsmallest;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite deset brojeva: ");
		int[] array = DvijeOverload.takeInput(input, 10, true);
		input.close();
		//int smallestInArray =  smallest(array);
		//int[] array = {10, 5, 9, 3, 6, 2, 4, 3};
		//int smallestInArray =  smallest(array);
		//int[] sortedList = sortList(List);
		
		//for (int i = 0; i < sortedList.length; i++) {
		//	System.out.print(sortedList[i] + " ");
		//}
		System.out.printf("\nIndeks najmanjeg u elementu je %d.", smallest(array));
	}

}
