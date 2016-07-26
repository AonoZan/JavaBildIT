import java.util.Scanner;

public class _11_DecimalToHex {

	public static void main(String[] args) {
		// create scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter a decimal value (0 - 15): ");

		//
		int hexadecimal = unos.nextInt();
		
		if(hexadecimal >= 0 && hexadecimal <= 9)
			System.out.printf("The hex value is %d", hexadecimal);
		else if(hexadecimal >= 10 && hexadecimal <= 15)
			System.out.printf("The hex value is %c", (char)(hexadecimal+55));
		else
			System.out.printf("%d is invalid input", hexadecimal);
		// cloose scanner
		unos.close();
	}

}
