/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class CircleFromGeometricObjectTest {

	public static void main(String[] args) {
		CircleFromGeometricObject circle = new CircleFromGeometricObject(5);
		
//		System.out.println("The color of circle is: " + circle.getColor());
//		System.out.println("The radius of circle is: " + circle.getRadius());
//		System.out.println("The date of circle is: " + circle.getDateCreated());
		
		System.out.println(circle.toString());
		
		Triangle trokut = new Triangle(2, 2, 3);
		System.out.println(trokut.toString());
		System.out.println("\tcolor: " +
							trokut.getColor() +
							"\n\tdate: " +
							trokut.getDateCreated());
	}

}
