import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _14_ComputingBMI {
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double poundToKilograms = 0.45359237;
		double inchToMeters = 0.0254;
		
		System.out.print("Enter weight in pounds: ");
		double weight = 95.5;//.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = 50;//unos.nextDouble();
		
		double bmi = (weight * poundToKilograms) / ((height * inchToMeters)*(height * inchToMeters));
		
		System.out.print("BMI is " + bmi);
		
		unos.close();
	}

}
