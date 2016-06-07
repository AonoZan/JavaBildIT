/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class QuadraticEquationTest {

	public static void main(String[] args) {
		System.out.print("Enter values for a, b, c: ");
		int a = Inputs.input.nextInt();
		int b = Inputs.input.nextInt();
		int c = Inputs.input.nextInt();
		
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		
		if (equation.getDiscriminant() < 0) {
			System.out.println("The equation has no solution.");
		}else{
			System.out.printf("Root 1 = %.2f\n", equation.getRoot1());
			if (equation.getDiscriminant() > 0) {
				System.out.printf("Root 2 = %.2f\n", equation.getRoot2());
			}
		}
	}

}
