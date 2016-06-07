/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _27_Dan;

public class TriangleFromGeometricObject extends GeometricObject{
	private double side_1, side_2, side_3;
	private String color;
	private boolean filled;
	
	public TriangleFromGeometricObject() {
	}
	TriangleFromGeometricObject(double side_1, double side_2, double side_3){
		this.side_1 = side_1;
		this.side_2 = side_2;
		this.side_3 = side_3;
	}
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return filled;
	}
	public double getPerimeter(){
		return side_1 + side_2 + side_3;
	}
	public double getArea(){
		double s = getPerimeter()/2;
		return Math.sqrt(s * (s - side_1)*(s - side_2)*(s - side_3));
	}
}
