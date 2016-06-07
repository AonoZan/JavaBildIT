/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Rectangle {
	private double width;
	private double height;
	
	Rectangle() {
	}
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return this.width * this.height;
	}
	public double getPerimeter() {
		return 2 *(this.width + this.height);
	}
	public String toString() {
		return "Rectangle of:\n\twidth:" +
				this.width + 
				"\n\theight: " +
				this.height +
				"\n\tarea: " +
				getArea() +
				"\n\tperimeter: " +
				getPerimeter();
	}
}
