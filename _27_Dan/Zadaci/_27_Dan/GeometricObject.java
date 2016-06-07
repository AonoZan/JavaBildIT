/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _27_Dan;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	
	GeometricObject() {
	}
	GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return filled;
	}
	
}
