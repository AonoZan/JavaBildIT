/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _27_Dan;

public class RectangleFromGeometricObject extends GeometricObject{
	private double width;
	private double height;
	
	public RectangleFromGeometricObject(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return width * height;
	}
	public double getPerimeter(){
		return 2 * (width + height);
	}
}
