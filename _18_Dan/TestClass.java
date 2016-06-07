
public class TestClass {

	public static void main(String[] args) {
		Circle krug = new Circle();
		System.out.println(krug.getRadius() );
		
		Circle krug1 = new Circle(5);
		System.out.println(krug1.getRadius() );
		
		krug1.setRadius(10);
		System.out.println(krug1.getRadius() );
	}

}
