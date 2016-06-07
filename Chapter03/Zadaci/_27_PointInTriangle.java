/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _27_PointInTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double p_x = input.nextDouble();
		double p_y = input.nextDouble();
		
		if(p_x > 0 && p_y > 0 && p_x+2*p_y < 200)
			System.out.println("Point is inside triangle.");
		else
			System.out.println("Point is outside triangle.");
		
		input.close();
	}

}
