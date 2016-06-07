/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class RacunarTest {

	public static void main(String[] args) {
		Racunar racunar = new Racunar(2, 250, 3.2, 15.5, 600);
		Laptop acer = new Laptop(racunar, 6.5);
		
		System.out.println(acer.toString());
	}

}
