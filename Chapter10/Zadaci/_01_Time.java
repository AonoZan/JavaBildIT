/**@autor AonoZan Dejan Petrovic 2016 ©
 */

/*UML
 * 		Time
 *  - hour: long
 *  - minute: long
 *  - second: long
 *  
 *  Time()
 *  Time(milliseconds: long)
 *  
 *  + getHour(): long
 *  + getMinute(): long
 *  + getMinute(): long
 *  
 *  + setTime(elapseTime: long)
 *  
 */

public class _01_Time {
	// variables to store time
	private long hours;
	private long minutes;
	private long seconds;
	
	// static variable to store time zone
	public static int utc = 0;
	
	// constructor that creates time from current milliseconds
	_01_Time() {
		this(System.currentTimeMillis());
	}
	// constructor that takes variable and extracts hour, minute and seconds
	_01_Time(long milliseconds) {
		this.hours = milliseconds/1000/60/60%24 + utc;
		this.minutes = milliseconds/1000/60%60 + utc;
		this.seconds = milliseconds/1000%60 + utc;
	}
	
	// basic getterrs
	public long getHours() {
		return hours;
	}
	public long getMinutes() {
		return minutes;
	}
	public long getSeconds() {
		return seconds;
	}
	
	// method for seting up new time
	public void setTime(long elapseTime) {
		return;
	}
}
