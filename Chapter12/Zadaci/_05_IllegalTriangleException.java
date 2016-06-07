/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _05_IllegalTriangleException {

	public static void main(String[] args) throws IllegalTriangleException {
		Triangle triangle = new Triangle();
		try {
			triangle = new Triangle(2, 2, 3);
			System.out.println("Triangle created.");
		} catch (IllegalTriangleException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(triangle.toString());

	}

}
class Triangle {
	int side1, side2, side3;
	Triangle() throws IllegalTriangleException{
		this(2, 2, 3);
	}
	Triangle(int side1, int side2, int side3) throws IllegalTriangleException{
		if(side1+side2 <= side3 ||
			side2+side3 <= side1 ||
			side3+side1 <= side2){
			throw new IllegalTriangleException("Illegal measurments of triangle sides.");
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
}
class IllegalTriangleException extends Exception{
	private static final long serialVersionUID = 1L;

	IllegalTriangleException(String message){
		super(message);
	}
}