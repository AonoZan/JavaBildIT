import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _23_CostOfDriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance of trip: ");
		double distance = 900.5;//input.nextDouble();
		
		System.out.println("Enter car fuel efficiency: ");
		double fuelEfficiency = 25.5;//input.nextDouble();
		
		System.out.println("Enter cost of fuel: ");
		double fuelCost = 3.55;//input.nextDouble();
		
		double costOfTrip = distance / fuelEfficiency * fuelCost;
		System.out.printf("Cost of trip is %.2f$", costOfTrip);
		
		input.close();
	}

}
