/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class RegularPolygonTest {
	public static void main(String[] arg) {
		RegularPolygon regularPolygonDef = new RegularPolygon();
		System.out.printf("Area of default polygon %.2f and perimeter %.2f.\n",
				regularPolygonDef.getArea(),
				regularPolygonDef.getPerimeter());
		
		// 41.5692 18
		RegularPolygon regularPolygon1 = new RegularPolygon(6, 4);
		System.out.printf("Area of second polygon %.2f and perimeter %.2f.\n",
				regularPolygon1.getArea(),
				regularPolygon1.getPerimeter());
		
		RegularPolygon regularPolygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.printf("Area of another polygon %.2f and perimeter %.2f.\n",
				regularPolygon2.getArea(),
				regularPolygon2.getPerimeter()); 
	}
}
