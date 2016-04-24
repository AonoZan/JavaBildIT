/**
 * @autor AonoZan Dejan Petrovic 2016
 */
public class _7_FindShortest3DSpace {
	public static double distance(double[] p1, double[] p2){
		return Math.sqrt(Math.pow((p2[0] - p1[0]), 2) + Math.pow((p2[1] - p1[1]), 2) + Math.pow((p2[2] - p1[2]), 2));
	}
	public static void main(String[] args) {
		double[][] points = {
				{-1, 0, 3},
				{-1, -1, -1},
				{4, 1, 1},
				{2, 0.5, 9},
				{3.5, 2, -1},
				{3, 1.5, 3},
				{-1.5, 4, 2},
				{5.5, 4, -0.5}};
		int p1 = 0;
		int p2 = 1;
		double ShortestDistance = distance(points[0], points[1]);
		for (int i = 0; i < points.length; i++) {
			for (int j = i+1; j < points.length; j++) {
				double distance = distance(points[i], points[j]);
				if (distance < ShortestDistance) {
					ShortestDistance = distance;
					p1 = i+1;
					p2 = j+1;
				}
				//System.out.printf("Distance of p%d and p%d is %.3f\n", i+1, j+1, distance);
			}
		}
		System.out.printf("\n\nThe closest two points are p%d and p%d.\nDistance is %.3f\n", p1, p2, ShortestDistance);
	}

}
