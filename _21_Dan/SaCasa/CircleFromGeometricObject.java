/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class CircleFromGeometricObject extends GeometricObject {
	private double radius;
	
	public CircleFromGeometricObject(){}
	
	public CircleFromGeometricObject(double radius) {
		super("plava");
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public String toString() {
		return "Circle:\n" +
				super.toString() +
				"\n\tradius: " +
				getRadius();
	}

}
