/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _29_CircleOverlap {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner() {input.close();}
	
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
	public static void main(String[] args) {
		System.out.print("Enter circle1 center (x, y) and radius: ");
		double c1x = 3.4;// input.nextDouble();
		double c1y = 5.7;// input.nextDouble();
		double c1r = 5.5; //input.nextDouble();
		
		System.out.print("\nEnter circle2 center (x, y) and radius: ");
		double c2x = 6.7; //input.nextDouble();
		double c2y = 3.5; //input.nextDouble();
		double c2r = 3; //input.nextDouble();
		
		double distance = getDistance(c1x, c1y, c2x, c2y);
		
		System.out.println();
		
		if (distance <= (c1r - c2r)) {
			System.out.println("Circle2 is inside Circle1.");
		}else if (distance <= (c1r + c2r)){
			System.out.println("Circle2 overlaps Circle1.");
		}else {
			System.out.println("Circle2 does not overlap Circle1.");
		}
		
		
		closeScanner();
	}

}
