import java.util.Scanner;

public class _9_FindUnicode {

	public static void main(String[] args) {
		// create scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter a character: ");

		//
		char character = unos.next().charAt(0);

		// cloose scanner
		unos.close();

		// calculate
		System.out.printf("The unicode for character %c is %d.", character, (int)character);

	}

}
