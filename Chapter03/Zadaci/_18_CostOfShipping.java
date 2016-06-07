import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _18_CostOfShipping {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight: ");
		double weight = input.nextDouble();
		
		if(0 < weight && weight < 1) System.out.println("Cost is 3.5$");
		if(1 < weight && weight < 3) System.out.println("Cost is 5.5$");
		if(3 < weight && weight < 10) System.out.println("Cost is 8.5$");
		if(10 < weight && weight < 20) System.out.println("Cost is 10.5$");
		else System.out.println("The package can not be shipped.");
		
		input.close();
	}
}
