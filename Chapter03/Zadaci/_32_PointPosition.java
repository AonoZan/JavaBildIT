/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _32_PointPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points value: ");
		double p1_x = input.nextDouble();
		double p1_y = input.nextDouble();
		
		double p2_x = input.nextDouble();
		double p2_y = input.nextDouble();
		
		double p3_x = input.nextDouble();
		double p3_y = input.nextDouble();
		
		double position = (p2_x - p1_x)*(p3_y - p1_y) - (p3_x - p1_x)*(p2_y - p1_y);
		
		if (position > 0)
			System.out.printf("Point (%.1f, %.1f)is on the left side of the line (%.1f, %.1f) to (%.1f, %.1f).",
					p3_x, p3_y, p1_x, p1_y, p2_x, p2_y);
		else if (position < 0)
			System.out.printf("Point (%.1f, %.1f)is on the right side of the line (%.1f, %.1f) to (%.1f, %.1f).",
					p3_x, p3_y, p1_x, p1_y, p2_x, p2_y);
		else
			System.out.println("Point is on the line.");
		
		input.close();
	}

}
