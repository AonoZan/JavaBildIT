/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class MyCalendarTest {

	public static void main(String[] args) {
		for (long i = 0, date = 10000; i < 8; i++, date *= 10) {
//			System.out.println(date);
			MyCalendar anotherDate = new MyCalendar(date);
			System.out.println(anotherDate.toString());
		}
	}

}
