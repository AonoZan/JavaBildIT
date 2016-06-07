/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _25_IntersectingLines {
	public static void main(String[] args) {
		double x = 0, y = 0, x1, y1, x2, y2, x3, y3, x4, y4;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
//		y1 = input.nextDouble();
//		x2 = input.nextDouble();
//		y2 = input.nextDouble();
//		x3 = input.nextDouble();
//		y3 = input.nextDouble();
//		x4 = input.nextDouble();
//		y4 = input.nextDouble();
		x1 = 2;
		y1 = 2;
		x2 = 5;
		y2 = -1;
		x3 = 4;
		y3 = 2;
		x4 = -1;
		y4 = -2;
		
		double d = (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4);
		if (d == 0)
			System.out.println("Lines are parallel.");
		else{
			x = ((x1*y2-y1*x2)*(x3-x4) - (x1-x2)*(x3*y4-y3*x4))/d;
			y = ((x1*y2-y1*x2)*(y3-y4) - (y1-y2)*(x3*y4-y3*x4))/d;
			System.out.printf("The intersecting point is at (%.4f, %.4f)\n", x, y);
		}
		input.close();
	}
}