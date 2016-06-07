import java.util.Scanner;

public class _02_VolumeOfCylinder {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Enter the radius and length of a cylinder: ");

		// prikupi
		double radius = unos.nextDouble();
		double length = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double area = radius * radius * 3.14159;
		double volume = area * length;

		// serviraj rezultat
		System.out.printf("The area is %.4f.\nThe volume is %.1f.", area, volume);

	}

}
