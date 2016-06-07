/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _23_PointInRectangle {

	public static void main(String[] args) {
		// init Scanner and values
		Scanner input = new Scanner(System.in);
		double userX, userY, rectX, rectY, rectWidth, recthHeight, distanceHorisontal, distanceVertical;
		System.out.print("Enter point values (x, y): ");
		userX = input.nextDouble();
		userY = input.nextDouble();
		rectX = 0; rectY = 0;
		rectWidth = 10; recthHeight = 5;
		// x y x1 y1
		// x y x1 y
		// x y x y1
		distanceHorisontal = Math.sqrt(Math.pow((userX-rectX), 2) + Math.pow((rectY-rectY), 2));
		distanceVertical = Math.sqrt(Math.pow((rectX-rectX), 2) + Math.pow((userY-rectY), 2));
		
		if(distanceHorisontal <= rectWidth/2 && distanceVertical <= recthHeight/2)
			System.out.println("Point is inside rectangle.");
		else
			System.out.println("Point is outside rectangle.");
		input.close();
	}

}
