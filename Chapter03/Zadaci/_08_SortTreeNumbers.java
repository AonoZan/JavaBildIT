import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _08_SortTreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter tree numbers: ");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		
		if(Math.max(number1, number2) <= number3){
			System.out.println(
					Math.min(number1, number2) + " " + 
					Math.max(number1, number2) + " " +
					number3
					);
		}else if (Math.max(number2, number3) <= number1) {
			System.out.println(
					Math.min(number2, number3) + " " + 
					Math.max(number2, number3) + " " +
					number1
					);
		}else{
			System.out.println(
					Math.min(number3, number1) + " " + 
					Math.max(number3, number1) + " " +
					number2
					);
		}
		
		
		input.close();
	}

}
