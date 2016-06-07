/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle firstRect = new Rectangle();
		firstRect.setHeight(40);
		firstRect.setWidth(4);
		System.out.println(firstRect.toString());
		
		Rectangle secondRect = new Rectangle(3.5, 35.9);
		System.out.println(secondRect.toString());
	}

}
