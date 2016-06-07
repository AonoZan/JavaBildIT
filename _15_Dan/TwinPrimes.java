
public class TwinPrimes {
	public static void printTwinPrimes(int from, int to){
		int first = 0;
		int second = 0;
		int noviRed = 0;
		for (int i = from; i < to; i++) {
			for (int j = 1; j <= i; j++) {
				// ako j nije (1 ili i) i djeljivo sa i
				if (j != 1 && j != i && i % j == 0) {
					//System.out.println("nije  " + i);
					break;
				}else if (j == i) {
					first = i;
					if ((first - 2) == (second)) {
						System.out.printf("%d - %d, ", second, first);
						noviRed++;
					}
					second = first;
					if (noviRed == 10) {
						System.out.println();
						noviRed = 0;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		printTwinPrimes(2, 1000);
	}

}
