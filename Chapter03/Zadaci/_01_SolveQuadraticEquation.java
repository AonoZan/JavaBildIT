import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _01_SolveQuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		
		double a = 1;//input.nextDouble();
		double b = 3;//input.nextDouble();
		double c = 1;//input.nextDouble();
		
		double discriminant = b*b - (4.0*a*c);
		
		double root1, root2;
		
		if (discriminant > 0){
			root1 = (-(b) + Math.sqrt(discriminant)) / (2*a);
			root2 = (-(b) - Math.sqrt(discriminant)) / (2*a);
			System.out.printf("The equation has two root: %.2f and %.2f.", root1, root2);
		}else if (discriminant == 0) {
			root1 = (-(b) + Math.sqrt(discriminant)) / (2*a);
			System.out.println("The equation has one root " + root1);
		}else {
			System.out.println("The eqi+uation has no real roots.");
		}
		
		input.close();
	}

}
