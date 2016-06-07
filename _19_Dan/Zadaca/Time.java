/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Time {
	private long hour;
	private long minutes;
	private long seconds;
	static int utc = 0;
	
	Time() {
		this(System.currentTimeMillis());
	}
	Time(long elapsedTime) {
		this.seconds = elapsedTime / 1000 % 60;
		this.minutes = elapsedTime / 1000 / 60 % 60;
		this.hour = elapsedTime / 1000 / 60 / 60 % 24 + utc;
	}
	Time(long hour, long minutes, long seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public long getHour() {
		return hour;
	}
	public long getMinutes() {
		return minutes;
	}
	public long getSeconds() {
		return seconds;
	}
	
	public void setTime(long elapsedTime) {
		this.seconds += elapsedTime / 1000 % 60;
		this.minutes += elapsedTime / 1000 / 60 % 60;
		this.hour += elapsedTime / 1000 / 60 / 60 % 24;
	}
}
