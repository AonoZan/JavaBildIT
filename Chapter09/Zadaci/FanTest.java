/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class FanTest {

	public static void main(String[] args) {
		Fan blueFan = new Fan();
		Fan yellowFan = new Fan();
		
		blueFan.setSpeed(Fan.MEDIUM);
		
		yellowFan.setSpeed(Fan.FAST);
		yellowFan.setColor("yellow");
		yellowFan.setRadius(10);
		yellowFan.setOn(true);
		
		System.out.println(blueFan.toString());
		System.out.println(yellowFan.toString());
	}
}
