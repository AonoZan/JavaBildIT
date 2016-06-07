/**
 * @autor AonoZan Dejan Petrovic 2016
 */
public class _23_LockerPuzzle {
	public static void main(String[] args) {
		int[] lockers = new int[100];
		for (int i = 1; i < lockers.length+1; i++) {
			for (int j = i; j < lockers.length+1; j+=i) {
				if (lockers[j-1] == 0) {
					lockers[j-1] = 1;
				}else {
					lockers[j-1] = 0;
				}
			}
		}
		Custom.printArray(lockers);
	}

}
