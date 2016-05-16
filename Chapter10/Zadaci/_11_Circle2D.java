/**@autor AonoZan Dejan Petrovic 2016 ©
 */
/*UML
 * 		Cirlce2D
 *  - x: double;
 *  - y: double
 *  - radius: double;
 *  
 *  Circle2D()
 *  Circle2D(x: double, y: double, radius: double)
 *  
 *  + getRadius(): double
 *  
 *  + getArea(): double
 *  + getPerimeter(): double
 *  + contains(x: double, y: double): boolean
 *  + contains(Circle2D circle): boolean
 *  + overlaps(Circle2D circle): boolean
 */
public class _11_Circle2D {
	private double x;
	private double y;
	private double radius;
	
	_11_Circle2D() {
		this(0, 0, 0);
	}
	_11_Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	public double getPerimeter() {
		return  2 * Math.PI * this.radius;
	}
	public boolean contains(double x, double y) {
		if (getDistance(this.x, this.y, x, y) <= this.radius) return true;
		return false;
	}
	public boolean contains(_11_Circle2D circle) {
		if (getDistance(this.x, this.y, circle.getX(), circle.getY()) <= (this.radius - circle.getRadius())) return true;
		return false;
	}
	public boolean overlaps(_11_Circle2D circle) {
		if (getDistance(this.x, this.y, circle.getX(), circle.getY()) <= (this.radius + circle.getRadius())) return true;
		return false;
	}
	
	private double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
}
