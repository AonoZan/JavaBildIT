/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class RegularPolygon {
	int n;
	double side;
	double x;
	double y;
	
	RegularPolygon() {
		this(3, 1, 0, 0);
	}
	RegularPolygon(int n, double side) {
		this(n, side, 0, 0);
	}
	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		// min number of sides must be 3
		if (n < 3) {n = 3; System.out.println("Min number of sides 3!");}
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea() {
//		 n * pow(s, 2) / 4 * tan(PI / n)
		return (this.n * this.side * this.side) /
				(4 * Math.tan(Math.PI / this.n));
	}
	public double getPerimeter() {
		return this.n * this.side;
	}
}
