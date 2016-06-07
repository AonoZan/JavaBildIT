import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter a, b, c: ");
		double a = unos.nextDouble();
		double b = unos.nextDouble();
		double c = unos.nextDouble();
		
		double root1, root2;

		// zatvori scanner
		unos.close();

		// izracunaj
		double discriminant = Math.pow(b, 2) - 4*a*c;

		if (discriminant > 0) {
			root1 = (-b + Math.pow(Math.pow(b, 2) - 4*a*c, 0.5))/2*a;
			root2 = (-a - Math.pow(Math.pow(b, 2) - 4*a*c, 0.5))/2*a;
			System.out.printf("The equation has two roots %f and %f", root1, root2);
		}else if (discriminant == 0) {
			root1 = (-b + Math.pow(Math.pow(b, 2) - 4*a*c, 0.5))/2*a;
			System.out.printf("The equation has one root %f", root1);
		}else {
			System.out.println("The equation has no real roots");
		}
		//System.out.println(discriminant);
	}

}
