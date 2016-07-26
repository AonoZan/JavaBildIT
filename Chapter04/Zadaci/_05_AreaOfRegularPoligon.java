import java.util.Scanner;

public class _05_AreaOfRegularPoligon {

	public static void main(String[] args) {
		// create a scanner
		Scanner unos = new Scanner(System.in);

		System.out.print("Enter number of sides: ");
		double numberOfSides = 5; //unos.nextDouble();
		System.out.print("Enter the side: ");
		double length = 6.5; //unos.nextDouble();

		// close scanner
		unos.close();
		
		double area = (numberOfSides * Math.pow(length, 2)) / (4.0 * Math.tan(Math.PI/numberOfSides));
		
		System.out.printf("\nThe area of pentagon is: %f", area);
		 
	}
}
