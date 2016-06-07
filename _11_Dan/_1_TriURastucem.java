import java.util.Scanner;


public class _1_TriURastucem {
	public static void displaySortedNumbers( double num1, double num2, double num3){
		System.out.print("Brojevi u rastucem nizu su: ");
		if (num1 > num2 && num1 > num3){
			System.out.print(num1 + ", ");
			if (num2 > num3) {
				System.out.print(num2 + ", " + num3 + ".");
			}else {
				System.out.print(num3 + ", " + num2 + ".");
			}
		}else if (num2 > num1 && num2 > num3){
			System.out.print(num2 + ", ");
			if (num1 > num3) {
				System.out.print(num1 + ", " + num3 + ".");
			}else {
				System.out.print(num3 + ", " + num1 + ".");
			}
		}else{
			System.out.print(num3 + ", ");
			if (num2 > num1) {
				System.out.print(num2 + ", " + num1 + ".");
			}else {
				System.out.print(num1 + ", " + num2 + ".");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite tri broja: ");
		double num1 = 0.5;//unos.nextDouble();
		double num2 = 0.8;//unos.nextDouble();
		double num3 = 0.1;//unos.nextDouble();
		
		unos.close();
		
		displaySortedNumbers(num1, num2, num3);
		
	}

}
