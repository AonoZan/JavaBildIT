/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _27_Dan;

public class CircleFromGeometricObject extends GeometricObject{
	private double radius;
	public CircleFromGeometricObject() {
	}
	public CircleFromGeometricObject(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}
	public double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
}
