
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cifra=1, pomoc1 = 0;
		for (int broj = 6; broj <= 10000; broj++) {
			
			while (cifra<broj) {
				
				if (broj%cifra == 0) {
					
					pomoc1 += cifra;
				}
				
				cifra++;
				
				if (pomoc1 == broj && pomoc1 == cifra) { ///////
					System.out.println(pomoc1);
				}
			}
			cifra = 1; //////
			pomoc1 = 0; //////
			
		}
	}

}
