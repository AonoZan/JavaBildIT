/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _11_Circle2DTest {

	public static void main(String[] args) {
		_11_Circle2D circle1 = new _11_Circle2D(2, 2, 5.5);
		
		System.out.printf("Perimeter: %.2f\n"
				+ "Area of circle: %.2f\n",
				circle1.getPerimeter(),
				circle1.getArea()
		);
		
		System.out.printf("%b\n%b\n%b\n",
				circle1.contains(3,3),
				circle1.contains(new _11_Circle2D(4, 5, 10.5)),
				circle1.overlaps(new _11_Circle2D(3, 5, 2.3))
		);
	}

}
