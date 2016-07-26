/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _06_RandomPointInCircle {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);

	public static void closeUserInput() {
		userInput.close();
	}

	public static void main(String[] args) {
		double radius = 40;
		
		double p1_alfa = Math.random() * (2*Math.PI);
		double p1_x =  radius * Math.cos(p1_alfa);
		double p1_y =  radius * Math.sin(p1_alfa);
		
		double p2_alfa = Math.random() * (2*Math.PI);
		double p2_x =  radius * Math.cos(p2_alfa);
		double p2_y =  radius * Math.sin(p2_alfa);
		
		double p3_alfa = Math.random() * (2*Math.PI);
		double p3_x =  radius * Math.cos(p3_alfa);
		double p3_y =  radius * Math.sin(p3_alfa);
		
		
		
//		System.out.printf("[%.2f %.2f] [%.2f %.2f] [%.2f %.2f]",
//				p1_x, p1_y,
//				p2_x, p2_y,
//				p3_x, p3_y);
		
		double a = Math.sqrt((p1_x - p2_x) * (p1_x - p2_x) + (p1_y - p2_y) * (p1_y - p2_y));
		double b = Math.sqrt((p2_x - p3_x) * (p2_x - p3_x) + (p2_y - p3_y) * (p2_y - p3_y));
		double c = Math.sqrt((p1_x - p3_x) * (p1_x - p3_x) + (p1_y - p3_y) * (p1_y - p3_y));
		
		double angle1 = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double angle2 = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double angle3 = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		System.out.printf("Three angles are %.2f, %.2f and %.2f.", angle1, angle2, angle3);
		
		closeUserInput();
	}
}
