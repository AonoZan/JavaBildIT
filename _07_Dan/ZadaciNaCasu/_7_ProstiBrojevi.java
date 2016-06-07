public class _7_ProstiBrojevi {

	public static void main(String[] args) {
		int noviRed = 0;
		
		// broji i od 2 do 1000
		for (int i = 2; i <= 1000; i++) {
			//broji j od 1 do i
			for (int j = 1; j <= i; j++) {
				// ako j nije (1 ili i) i djeljivo sa i
				if (j != 1 && j != i && i % j == 0) {
					//System.out.println("nije  " + i);
					break;
				}else if (j == i) {
					System.out.print(i + " ");
					noviRed++;
				}
			}
			if (noviRed % 8 == 0 && noviRed != 0) {
				System.out.println();
				noviRed = 0;
			}
		}
		
	}

}
