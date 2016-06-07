/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _27_Dan;

public class TestGEometricObjects {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);

	public static void closeUserInput() {
		userInput.close();
	}
	public static boolean equalArea(GeometricObject object1, GeometricObject object2){
		return object1.getArea() == object2.getArea();
	}
	public static void main(String[] args) {
		GeometricObject circle = new CircleFromGeometricObject(5);
		GeometricObject rectangle = new RectangleFromGeometricObject(5, 3);
		
		System.out.printf("Objekti imaju istu povrsinu? %b",
				equalArea(circle, rectangle));
		
		closeUserInput();
	}
}
