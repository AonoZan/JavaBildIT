/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestMyDate {

	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		System.out.printf("The date is: %2d:%2d:%4d\n",
				date1.getDay(),
				date1.getMonth(),
				date1.getYear());
		
		MyDate date2 = new MyDate(34355555133101L);
		System.out.printf("The date is: %2d:%2d:%4d\n",
				date2.getDay(),
				date2.getMonth(),
				date2.getYear());
	}

}
