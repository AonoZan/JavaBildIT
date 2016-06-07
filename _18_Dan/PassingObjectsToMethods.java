
public class PassingObjectsToMethods {
	public static void printCircle(Circle c){
		System.out.println(c.getRadius());
		c.setRadius(10);
	}
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		printCircle(c1);
		System.out.println(c1.getRadius());
	}

}
