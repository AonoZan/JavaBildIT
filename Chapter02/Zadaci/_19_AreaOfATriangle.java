import java.util.Scanner;

public class _19_AreaOfATriangle {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Enter three points for a triangle: ");

		// prikupi
		double x1 = 1.5; //unos.nextDouble();
		double y1 = -3.4; //unos.nextDouble();
		
		double x2 = 4.6; //unos.nextDouble();
		double y2 = 5.0; //unos.nextDouble();
		
		double x3 = 9.5; //unos.nextDouble();
		double y3 = -3.4; //unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double side1 = Math.pow(Math.pow((x2 - x1), 2.0) + Math.pow((double)(y2 - y1), 2.0), 0.5);
		double side2 = Math.pow(Math.pow((x3 - x2), 2.0) + Math.pow((double)(y3 - y2), 2.0), 0.5);
		double side3 = Math.pow(Math.pow((x1 - x3), 2.0) + Math.pow((double)(y1 - y3), 2.0), 0.5);
		double s = (side1 + side2 + side3)/2.0;
		
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		// serviraj rezultat
		System.out.printf("The area of the triangle is %.1f", area);
		
		// Math.pow(1128.96, 0.5)
		//System.out.println(Math.pow(1128.96, 0.5));

	}

}
