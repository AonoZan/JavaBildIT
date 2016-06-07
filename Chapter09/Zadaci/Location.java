/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Location {

	public int row;
	public int column;
	public double maxValue;
		
	Location(double[][] a) {
		this.maxValue = 0;
		this.row = 0;
		this.column = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > this.maxValue) {
					this.maxValue = a[i][j];
					this.row = i;
					this.column = j;
				}
			}
		}
	}
}
