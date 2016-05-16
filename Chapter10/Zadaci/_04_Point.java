/**@autor AonoZan Dejan Petrovic 2016 ©
 */

/*UML
 * 		Point
 * 
 * - x: double
 * - y: double
 * 
 * Point()
 * Point(x: double, y: double)
 * 
 * + getDistance(point: Point)
 * + getDistance(x: double, y: double)
 */
public class _04_Point {
	private double x;
	private double y;
	
	_04_Point() {
		this(0, 0);
	}
	_04_Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(_04_Point point) {
		return getDistance(point.x, point.y);
	}
	public double getDistance(double x, double y) {
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
	}
}
