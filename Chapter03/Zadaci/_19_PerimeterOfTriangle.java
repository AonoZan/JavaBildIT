/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _19_PerimeterOfTriangle {

	public static void main(String[] args) {
		// init scanner and three sides of triangle
		Scanner input = new Scanner(System.in);
		double a, b, c;
		
		// prompt for and get three sides of triangle
		System.out.print("Enter three sides of triangle: ");
		a = input.nextDouble(); b = input.nextDouble(); c = input.nextDouble();
		
		// if any of two sides of triangle is greater than third show perimeter
		if((a+b)>c && (b+c)>a && (c+a)>b)
			System.out.printf("Perimeter if triangle is %.2f.", (a+b+c));
		else System.out.println("Input is not valid.");
		
		input.close();
	}

}
