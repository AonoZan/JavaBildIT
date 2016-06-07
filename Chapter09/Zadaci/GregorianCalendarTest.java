import java.util.GregorianCalendar;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class GregorianCalendarTest {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.printf("Date: %2d:%2d:%4d\n", calendar.get(GregorianCalendar.DAY_OF_MONTH),
				calendar.get(GregorianCalendar.MONTH),
				calendar.get(GregorianCalendar.YEAR));
		
		calendar.setTimeInMillis(1234567898765L);
		System.out.printf("Date: %2d:%2d:%4d\n", calendar.get(GregorianCalendar.DAY_OF_MONTH),
				calendar.get(GregorianCalendar.MONTH),
				calendar.get(GregorianCalendar.YEAR));
	}

}
