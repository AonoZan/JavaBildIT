import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	MyDate() {
		setDate(System.currentTimeMillis());
	}
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	public void setDate(long elapsedTime) {
		Instant instant = Instant.ofEpochMilli(elapsedTime);
		ZoneId zoneId = ZoneId.systemDefault();
		Clock clock = Clock.fixed(instant, zoneId);
		LocalDate now = LocalDate.now(clock);
		this.year = now.getYear();
		this.month = now.getMonthValue();
		this.day = now.getDayOfMonth();
	}
}
