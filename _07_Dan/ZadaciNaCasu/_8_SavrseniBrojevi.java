public class _8_SavrseniBrojevi {

	public static void main(String[] args) {
		int savrsenBroj = 0;
		
		// od 0 do 1000
		for (int i = 0; i <= 10000; i++) {
			// od trenutnog i pa do 1
			for (int j = i; j >= 1; j--) {
				
				if (i % j == 0 && i != j) {
					savrsenBroj += j;
				}
			}
			if (savrsenBroj == i && i != 0) {
				System.out.println(savrsenBroj + " je savrsen broj.");
			}
			savrsenBroj = 0;
			
		}
		// 6 = 3 + 2 + 1
		// 28 = 14 + 7 + 4 + 2 + 1
	}

}
