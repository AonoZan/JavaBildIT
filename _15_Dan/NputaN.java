
public class NputaN {
	public static int[][] createArray(int howMany){
		int[][] array = new int[howMany][howMany];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*2);
			}
		}
		return array;
	}
	public static void printArray(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.printf("%d, ", array[i][j]);
			}
			System.out.printf("%d.\n", array[i][array.length-1]);
		}
	}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite velicinu niza: ");
		int howMany = input.nextInt();
		input.close();
		int[][] array = createArray(howMany);
		printArray(array);
	}

}
