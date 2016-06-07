import java.util.Scanner;

public class UndeterminedLengthArrayAverage {
	public static int[] belowAverageOrAbove(double[] allNums){
		double average = DvijeOverload.average(allNums);
		System.out.println(average);
		int belowAverageNums = 0;
		int aboveAverageNums = 0;
		for (int i = 0; i < allNums.length; i++) {
			if (allNums[i] >= average) {
				aboveAverageNums++;
				System.out.println("up");
			}else if (allNums[i] < average && allNums[i] > 0){
				belowAverageNums++;
				System.out.println("down");
			}
		}
		int[] temp = {aboveAverageNums, belowAverageNums};
		return temp;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite nekoliko brojeva(maksimalno 100): ");
		double[] array = DvijeOverload.takeInput(input, 100);
		input.close();
		int[] belowAboveAverage =  belowAverageOrAbove(array);
		System.out.printf("\nBrojeva iznad prosjeka ima %d, a ispod %d.", belowAboveAverage[0], belowAboveAverage[1]);
	}

}
