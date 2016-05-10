public class TestLinearEquation {
	public static void main(String[] args) {
		System.out.println("Enter values for a, b, c, d, e and f: ");
		int[] values = new int[6];
		Inputs.inputArray(values);
		
//		double[] values = {5, 4, 8, 9, 1, 2};
		
		LinearEquation freshEquation = new LinearEquation(values[0], values[1], values[2], values[3], values[4], values[5]);
		System.out.printf("Equation solvable status(%s).\n", freshEquation.isSolvable());
		System.out.printf("X = %.3f\nY = %.3f", freshEquation.getX(), freshEquation.getY());
	}
}
