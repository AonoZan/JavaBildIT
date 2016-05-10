
public class TestMyCalendar {

	public static void main(String[] args) {
		MyCalendar currentDate = new MyCalendar();
		System.out.println(currentDate.toString());
		
		MyCalendar anotherDate = new MyCalendar(1234567898765L);
		System.out.println(anotherDate.toString());
	}
}
