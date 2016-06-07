import java.util.Scanner;

public class _5_AreaOfRegularPoligon______________________ {

	public static void main(String[] args) {
		// create a scanner
		Scanner unos = new Scanner(System.in);

		System.out.print("Enter number of sides: ");
		double numberOfSides = 5; //unos.nextDouble();
		System.out.print("Enter the length from center to a vertex: ");
		double length = 6.5; //unos.nextDouble();

		// close scanner
		unos.close();
		
		double side = ( 2 * length) * Math.sin(Math.PI/numberOfSides);
		double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/numberOfSides));
		
		System.out.printf("\nThe area of pentagon is: %f", area);
		 
	}
}
