
public class TestQuadraticEquation {

	public static void main(String[] args) {
		System.out.print("Enter values for a, b, c: ");
		int a = Inputs.input.nextInt();
		int b = Inputs.input.nextInt();
		int c = Inputs.input.nextInt();
		
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		
		double result = equation.getDiscriminant();
		System.out.println(result);
		if (result >= 0) {
			System.out.printf("Root one is: %s.\nRoot two is: %s.\n", equation.getRoot1(), equation.getRoot2());
		}else if (result < 0) {
			System.out.printf("Root one is: %s.\n", equation.getRoot1());
		}else {
			System.out.println("The equation has no result.");
		}
	}

}
