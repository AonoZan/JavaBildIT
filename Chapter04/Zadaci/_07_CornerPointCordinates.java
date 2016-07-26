/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _07_CornerPointCordinates {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);
	public static void closeUserInput() {
		userInput.close();
	}

	public static void main(String[] args) {
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = 100;//userInput.nextDouble();
		
		double p1_x =  radius * Math.cos(0);
		double p1_y =  radius * Math.sin(0);
		
		double p2_alfa = (2*Math.PI)/10*2;
		double p2_x =  radius * Math.cos(p2_alfa);
		double p2_y =  radius * Math.sin(p2_alfa);
		
		double p3_alfa = (2*Math.PI)/10*4;
		double p3_x =  radius * Math.cos(p3_alfa);
		double p3_y =  radius * Math.sin(p3_alfa);
		
		double p4_alfa = (2*Math.PI)/10*4;
		double p4_x =  radius * Math.cos(p4_alfa);
		double p4_y =  radius * Math.sin(p4_alfa);
		
		double p5_alfa = (2*Math.PI)/10*4;
		double p5_x =  radius * Math.cos(p5_alfa);
		double p5_y =  radius * Math.sin(p5_alfa);
		
		System.out.printf("[%.2f %.2f] [%.2f %.2f] [%.2f %.2f] [%.2f %.2f] [%.2f %.2f]",
				p1_x, p1_y,
				p2_x, p2_y,
				p3_x, p3_y,
				p4_x, p4_y,
				p5_x, p5_y);
		
		closeUserInput();
	}
}
