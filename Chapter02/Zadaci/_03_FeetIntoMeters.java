import java.util.Scanner;

public class _03_FeetIntoMeters {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Enter a value for feet: ");

		// prikupi
		double feet = unos.nextDouble();
		
		// zatvori scanner
		unos.close();

		// izracunaj 
		double meters = feet * 0.305;

		// serviraj rezultat
		System.out.printf("%.2f feets is %.2f in meters.", feet, meters);

	}

}
