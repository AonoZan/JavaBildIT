import java.util.Scanner;

public class _11_DecimalToHex {

	public static void main(String[] args) {
		// create scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter a decimal value (0 - 15): ");

		//
		byte hexadecimal = unos.nextByte();

		// cloose scanner
		unos.close();

		// calculate
		System.out.println((char)hexadecimal);

	}

}
