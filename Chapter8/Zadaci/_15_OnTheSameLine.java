/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _15_OnTheSameLine {

	public static void main(String[] args) {
		System.out.print("Enter five points: ");
		double degrees = 0;
		String fix = "";
		for (int i = 0; i < 5; i++) {
			double x = Inputs.input.nextDouble();
			double y = Inputs.input.nextDouble();
			double pointsDegree = Math.atan2(x, y);
			if (degrees != 0 && pointsDegree != degrees) {
//				System.out.println("No!");
				fix = " not";
				break;
			}else if (i == 0 ) degrees = pointsDegree;
		}
		System.out.printf("The points are%s on the same line.", fix);
	}

}
