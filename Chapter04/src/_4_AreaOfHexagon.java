import java.util.Scanner;

public class _4_AreaOfHexagon {

	public static void main(String[] args) {
		// create a scanner
		Scanner unos = new Scanner(System.in);

		System.out.print("Enter the length from center to a vertex: ");
		double length = 5.5; //unos.nextDouble();

		// close scanner
		unos.close();
		
		double side = ( 2 * length) * Math.sin(Math.PI/6);
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6));
		
		System.out.printf("\nThe area of pentagon is: %f", area);
		 
	}
}
