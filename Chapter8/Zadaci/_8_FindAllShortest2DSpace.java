/**
 * @autor AonoZan Dejan Petrovic 2016
 */
public class _8_FindAllShortest2DSpace {
	public static double distance(double[] p1, double[] p2){
		return Math.sqrt((p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]));
	}
	public static void main(String[] args) {
		double[][] points = {
				{0, 0},
				{1, 1},
				{-1, -1},
				{2, 2},
				{-2, -2},
				{-3, -3},
				{-4, -4},
				{5, 5}};
		double ShortestDistance = -1;
		String printString = "";
		for (int i = 0; i < points.length; i++) {
			for (int j = i+1; j < points.length; j++) {
				double distance = distance(points[i], points[j]);
				if (distance < ShortestDistance || ShortestDistance == -1) {
					ShortestDistance = distance;
					printString = "The clossest two points are ("+points[i][0]+", "+points[i][0]+") and ("+points[j][0]+", "+points[j][0]+")\n";
				}else if (distance == ShortestDistance) {
					printString += "The clossest two points are ("+points[i][0]+", "+points[i][0]+") and ("+points[j][0]+", "+points[j][0]+")\n";
				}
			}
		}
		System.out.printf(printString+"\nAnd their distance is %.4f.", ShortestDistance);
	}

}
