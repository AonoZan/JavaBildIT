/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _33_ComputeCost {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);

	public static void closeUserInput() {
		userInput.close();
	}

	public static void main(String[] args) {
		System.out.print("Enter weight and price for package1: ");
		double p1_price = userInput.nextDouble() / userInput.nextDouble();
		
		System.out.print("Enter weight and price for package1: ");
		double p2_price = userInput.nextDouble() / userInput.nextDouble();
		
		if(p1_price>p2_price)
			System.out.println("Package1 have better price.");
		else if(p1_price<p2_price)
			System.out.println("Package2 has better price.");
		else
			System.out.println("Packages cost same.");
		closeUserInput();
	}
}
