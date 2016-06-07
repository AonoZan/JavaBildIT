/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _22_PointInCircle {

	public static void main(String[] args) {
		// init scanner and get values for x and y
		Scanner input = new Scanner(System.in);
		System.out.print("Enter vales for x and y: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// calculate distance
		double distance = Math.sqrt(Math.pow((0-x), 2) + Math.pow((0-y), 2));
		
		// if distance is less than circle radius (10)
		if(distance <= 10)
			System.out.println("Point is inside circle.");
		else
			System.out.println("Point is outside circle.");
		input.close();
	}

}
