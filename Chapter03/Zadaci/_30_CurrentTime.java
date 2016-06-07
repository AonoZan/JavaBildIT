/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Scanner;

public class _30_CurrentTime {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		//
		System.out.print("Enter the time zone offset to GMT: ");

		// prikupi
		short userDesiredGTM = unos.nextShort();

		// zatvori scanner
		unos.close();

		// izracunaj
		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;
		short currentSecond = (short) (totalSeconds % 60);

		long totalMinutes = totalSeconds / 60;
		short currentMinute = (short) (totalMinutes % 60);

		long totalHours = totalMinutes / 60;
		short currentHour = (short) (totalHours % 24);
		
		if(currentHour >= 12) currentHour%=12;
		
		// serviraj rezultat
		System.out.printf("The current time is %d:%2d:%2d", currentHour + userDesiredGTM, currentMinute, currentSecond);

	}

}
