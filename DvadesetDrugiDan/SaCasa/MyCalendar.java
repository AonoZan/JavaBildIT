import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
//import java.util.Calendar;
//import java.util.GregorianCalendar;

public class MyCalendar {
	private int day;
	private int month;
	private int year;
	
	MyCalendar() {
		elapseDate(System.currentTimeMillis());
	}
	MyCalendar(long elapsedTime) {
		elapseDate(elapsedTime);
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public void elapseDate(long milliseconds) {
//		GregorianCalendar calendar = new GregorianCalendar();
//		calendar.setTimeInMillis(milliseconds);
//		
//		this.day = Calendar.DAY_OF_MONTH;
//		this.month = Calendar.MONTH;
//		this.year = Calendar.YEAR;
		Instant instant = Instant.ofEpochMilli(milliseconds);
		ZoneId zoneId = ZoneId.systemDefault();
		Clock clock = Clock.fixed(instant, zoneId);
		LocalDate now = LocalDate.now(clock);
		this.year = now.getYear();
		this.month = now.getMonthValue();
		this.day = now.getDayOfMonth();
	}
	public String toString() {
		return "Date is: " + this.day + ":" + this.month + ":" + this.year;
	}
}
