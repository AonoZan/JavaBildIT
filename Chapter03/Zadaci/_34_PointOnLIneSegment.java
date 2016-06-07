/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _34_PointOnLIneSegment {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);

	public static void closeUserInput() {
		userInput.close();
	}

	public static void main(String[] args) {
		System.out.print("Enter three points for p0, p1, and p2: ");
		double p1_x = userInput.nextDouble();
		double p1_y = userInput.nextDouble();
		
		double p2_x = userInput.nextDouble();
		double p2_y = userInput.nextDouble();
		
		double p3_x = userInput.nextDouble();
		double p3_y = userInput.nextDouble();
		
		double position = (p2_x - p1_x)*(p3_y - p1_y) - (p3_x - p1_x)*(p2_y - p1_y);
		if (position == 0 && p3_x<p2_x && p3_x>p1_x && p3_y<p2_y && p3_y>p1_y)
			System.out.printf("Point (%.1f, %.1f)is on line seqment (%.1f, %.1f) to (%.1f, %.1f).",
					p3_x, p3_y, p1_x, p1_y, p2_x, p2_y);
		else
			System.out.printf("Point (%.1f, %.1f)is not on line seqment (%.1f, %.1f) to (%.1f, %.1f).",
					p3_x, p3_y, p1_x, p1_y, p2_x, p2_y);
		
		closeUserInput();
	}
}
