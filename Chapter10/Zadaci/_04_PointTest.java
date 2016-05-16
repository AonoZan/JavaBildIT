/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _04_PointTest {

	public static void main(String[] args) {
		_04_Point point1 = new _04_Point();
		_04_Point point2 = new _04_Point(0, 2);
		
		System.out.println(point1.getDistance(2, 0));
		System.out.println(point1.getDistance(point2));
	}

}
