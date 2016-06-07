import java.util.ArrayList;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class ArrayListTest {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner() {input.close();}
	public static int sum(ArrayList<Double> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter 5 numbers: ");
		ArrayList<Double> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
		System.out.println("Sum of all is : " + sum(list));

	}

}
