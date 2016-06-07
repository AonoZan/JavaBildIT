/**@autor AonoZan Dejan Petrovic 2016 �
 */
import java.util.Scanner;

public class _20_WindChillTemperature {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter the temperature in Fahrenheit" +
				"\nbetween -58°F and 41°F: ");

		// prikupi
		double temperature = unos.nextDouble();
		
		// 
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");

		// prikupi
		double windSpeed = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double windChill = (35.74 + 0.6215 * temperature) -
				(35.75 * Math.pow(windSpeed, 0.16)) +
				(0.4275 * temperature *  Math.pow(windSpeed, 0.16));

		// serviraj rezultat
		if(windChill < -58 || windChill > 41 || windSpeed < 2)
			if (windChill < -58 || windChill > 41)
				System.out.println("Temperature is wrong.");
			if (windSpeed < 2)
				System.out.println("Speed is incorrect.");
		else
			System.out.printf("The wind chill index is %f", windChill);

	}

}
