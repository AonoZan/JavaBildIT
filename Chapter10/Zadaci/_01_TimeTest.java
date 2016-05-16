/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _01_TimeTest {

	public static void main(String[] args) {
		// setup time zone
		_01_Time.utc = 2;
		// create two objects
		// one with default current time and other custom
		_01_Time currentTime = new _01_Time();
		_01_Time otherTime = new _01_Time(555550000);
		
		// print times of both objects
		System.out.printf("Time : %2d:%2d:%2d\n",
				currentTime.getHours(),
				currentTime.getMinutes(),
				currentTime.getSeconds());
		System.out.printf("Time : %2d:%2d:%2d\n",
				otherTime.getHours(),
				otherTime.getMinutes(),
				otherTime.getSeconds());
	}

}
