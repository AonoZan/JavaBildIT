import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _11_NumberOfDaysInMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter month: ");
		int month = input.nextInt();
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		if((year % 4 == 0 && year % 400 != 0 || year % 400 == 0 ) && month == 2)
			System.out.printf("Februar %d had %d days", year, 29);
		else
			switch (month) {
			case 1:
				System.out.printf("Januar %d had %d days", year, 31);
				break;
			case 2:
				System.out.printf("Februar %d had %d days", year, 28);
				break;
			case 3:
				System.out.printf("Mart %d had %d days", year, 31);
				break;
			case 4:
				System.out.printf("April %d had %d days", year, 30);
				break;
			case 5:
				System.out.printf("Maj %d had %d days", year, 31);
				break;
			case 6:
				System.out.printf("Jun %d had %d days", year, 30);
				break;
			case 7:
				System.out.printf("Jul %d had %d days", year, 31);
				break;
			case 8:
				System.out.printf("Avgust %d had %d days", year, 31);
				break;
			case 9:
				System.out.printf("Septembar %d had %d days", year, 30);
				break;
			case 10:
				System.out.printf("Oktobar %d had %d days", year, 31);
				break;
			case 11:
				System.out.printf("Novembar %d had %d days", year, 30);
				break;
			case 12:
				System.out.printf("Decembar %d had %d days", year, 31);
				break;
			default:
				System.out.println("Greska");
				break;
			}
		
		
		input.close();
	}

}
