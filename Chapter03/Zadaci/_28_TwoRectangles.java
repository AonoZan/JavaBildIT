/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _28_TwoRectangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Eneter center, width and height (x, y, w, h) for first rectengle: ");
		double r1_x = input.nextDouble();
		double r1_y = input.nextDouble();
		double r1_w = input.nextDouble();
		double r1_h = input.nextDouble();
		System.out.print("Eneter center, width and height (x, y, w, h) for second rectengle: ");
		double r2_x = input.nextDouble();
		double r2_y = input.nextDouble();
		double r2_w = input.nextDouble();
		double r2_h = input.nextDouble();
		
		double distanceHorisontal = Math.sqrt(Math.pow((r1_x-r2_x), 2) + Math.pow((r2_y-r2_y), 2));
		double distanceVertical = Math.sqrt(Math.pow((r2_x-r2_x), 2) + Math.pow((r1_y-r2_y), 2));
		
		if(distanceHorisontal <= r1_w/2-r2_w/2 && distanceVertical <= r1_h/2-r2_h/2)
			System.out.println("r2 is inside r1");
		else if(distanceHorisontal <= r1_w/2+r2_w/2 && distanceVertical <= r1_h/2+r2_h/2)
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 is outside r1");
		
		input.close();
	}

}
