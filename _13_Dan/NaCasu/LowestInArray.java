import java.util.Scanner;

public class LowestInArray {
	public static double lowestDouble(double[] allNums){
		double lowestNum = DvijeOverload.average(allNums);
		for (int i = 0; i < allNums.length; i++) {
			if (lowestNum > allNums[i]) {
				lowestNum = allNums[i];
			}
		}
		return lowestNum;
	}
	public static int lowestInt(int[] allNums){
		int lowestNum = DvijeOverload.average(allNums);
		for (int i = 0; i < allNums.length; i++) {
			if (lowestNum > allNums[i]) {
				lowestNum = allNums[i];
			}
		}
		return lowestNum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite deset brojeva: ");
		double[] array = DvijeOverload.takeInput(input, 10);
		input.close();
		System.out.printf("\nNajmanji broj u nizu je %.2f.", lowestDouble(array));
	}

}
