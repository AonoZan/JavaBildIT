
public class Circle {
	private double radius;
	private static int numberOfObjects;
	
	Circle(){
		radius = 1;
		numberOfObjects++;
	}
	Circle(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	double getArea(){
		return radius * radius * Math.PI;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newRadius){
		if(newRadius >= 0){
			radius = newRadius;
		}
	}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
}
