/**@autor AonoZan Dejan Petrovic 2016 ©
 */

/*UML
 * 		Triangle
 *  side1: double = 1
 *  side1: double = 1
 *  side3: double = 1
 *  
 *  Triangle()
 *  Triangle(side1: double, side2: double, side2: double)
 *  
 *  + getSide1(): double
 *  + getSide2(): double
 *  + getSide3(): double
 *  
 *  + getArea(): double
 *  + getPerimeter(): double
 *  + toString(): String
 */

public class Triangle extends GeometricObject{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	Triangle() {
	}
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		return Math.sqrt(getPerimeter() * (getPerimeter() - this.side1) *
				(getPerimeter() - this.side2) *
				(getPerimeter() - this.side3));
	}
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3) / 2;
	}
	public String toString() {
		return "Triangle: \n\tside1: " +
				this.side1 +
				"\n\tside2: " +
				this.side2 +
				"\n\tside3: " +
				this.side3 +
				"\n\tperimeter: " +
				getPerimeter() +
				"\n\tarea: " +
				getArea();
	}
	
}
