import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _05_FutureDay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter todays day: ");
		int todaysDay = input.nextInt();
		
		System.out.print("Enter number of days after today: ");
		int daysAfter = input.nextInt();
		
		switch (todaysDay) {
		case 0:
			System.out.print("Today's Monday ");
			break;
		case 1:
			System.out.print("Today's Tuesday ");
			break;
		case 2:
			System.out.print("Today's Wendsday ");
			break;
		case 3:
			System.out.print("Today's Thursday ");
			break;
		case 4:
			System.out.print("Today's Friday ");
			break;
		case 5:
			System.out.print("Today's Saturday ");
			break;
		case 6:
			System.out.print("Today's Sunday ");
			break;
		default:
			System.out.print("Today's not a day ");
			break;
		}
		
		
		switch ((todaysDay + daysAfter) % 6) {
		case 0:
			System.out.print("and future day's Monday.");
			break;
		case 1:
			System.out.print("and future day's Tuesday.");
			break;
		case 2:
			System.out.print("and future day's Wendsday.");
			break;
		case 3:
			System.out.print("and future day's Thursday.");
			break;
		case 4:
			System.out.print("and future day's Friday.");
			break;
		case 5:
			System.out.print("and future day's Saturday.");
			break;
		case 6:
			System.out.print("and future day's Sunday.");
			break;
		default:
			System.out.print("and future day's not a day.");
			break;
		}
		
		input.close();
	}

}
