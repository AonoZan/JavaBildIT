import java.util.Scanner;

public class _01_CelsiusFarenheite {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter a degree in Celsius: ");

		// prikupi
		double celsius = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double fahrenheit = (9 / 5) * celsius + 32;

		// serviraj rezultat
		System.out.printf("%.2f Celsius is %.2f Fahrenheit", celsius, fahrenheit);

	}

}
