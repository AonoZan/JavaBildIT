import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _09_CheckISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int isbn, isbnTemp, number, checksum;
		
		System.out.print("Enter first 9 digits of ISBN number: ");
		isbn = input.nextInt()+1000000000;
		isbnTemp = isbn;
		
		number = ((isbnTemp/100000000) * 1) % 10;
		checksum = number;
		isbnTemp %= 100000000;
		System.out.print(number);
		
		number = (isbnTemp/10000000);
		checksum += number * 2;
		isbnTemp %= 10000000;
		System.out.print(number);
		
		number = (isbnTemp/1000000);
		checksum += number * 3;
		isbnTemp %= 1000000;
		System.out.print(number);
		
		number = (isbnTemp/100000);
		checksum += number * 4;
		isbnTemp %= 100000;
		System.out.print(number);
		
		number = (isbnTemp/10000);
		checksum += number * 5;
		isbnTemp %= 10000;
		System.out.print(number);
		
		number = (isbnTemp/1000);
		checksum += number * 6;
		isbnTemp %= 1000;
		System.out.print(number);
		
		number = (isbnTemp/100);
		checksum += number * 7;
		isbnTemp %= 100;
		System.out.print(number);
		
		number = (isbnTemp/10);
		checksum += number * 8;
		isbnTemp %= 10;
		System.out.print(number);
		
		number = isbnTemp;
		checksum += number * 9;
		System.out.print(number);
		
		checksum %= 11;
		
		if(checksum == 10) System.out.println("X");
		else System.out.println(checksum);
		
		input.close();
	}

}
