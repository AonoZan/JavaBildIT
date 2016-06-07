import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _03_LinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if((a*d - b*c) == 0){
			System.out.println("The equation has no solution.");
		}else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.printf("x = %.2f\ny = %.2f", x, y);
		}
		
		input.close();
	}

}
