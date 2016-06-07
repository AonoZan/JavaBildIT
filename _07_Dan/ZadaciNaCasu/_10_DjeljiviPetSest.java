public class _10_DjeljiviPetSest {

	public static void main(String[] args) {
		int noviRed = 0; // broji koliko je brojeva ispisano
		
		for (int i = 100; i <= 1000; i++) {
			//System.out.println(i);
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				noviRed++; // novi broj ispisan pa zapamti
			}
			// ako je djeljiv sa deset preskoci u novi red
			if (noviRed == 10) {
				System.out.println();
				noviRed = 0;
			}
		}
	}

}
