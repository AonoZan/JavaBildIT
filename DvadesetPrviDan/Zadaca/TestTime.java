/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestTime {

	public static void main(String[] args) {
		Time.utc = 2;
		
		Time homeClock = new Time();
		System.out.printf("Time on a home clock is: %d:%d:%d\n", 
				homeClock.getHour(),
				homeClock.getMinutes(),
				homeClock.getSeconds());
		
		long elapsedTime = 555550000; //System.currentTimeMillis();
		Time mobileClock = new Time(elapsedTime);
		System.out.printf("Time on a mobile phone is: %d:%d:%d\n", 
				mobileClock.getHour(),
				mobileClock.getMinutes(),
				mobileClock.getSeconds());
	}

}
