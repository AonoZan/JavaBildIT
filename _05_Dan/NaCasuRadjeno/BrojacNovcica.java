public class BrojacNovcica {
	

	public static void main(String[] args) {
		int pismoIliGlava = 0;
		int pismo = 0;
		int glava = 0;
		
		for (int i = 0; i < 1000; i++) {
			System.out.printf("Bacam novcic po %4d put.\n", i);
			
			pismoIliGlava = (int)(Math.random() * 2);
			
			if (pismoIliGlava == 0) {
				pismo++;
				
			} else if (pismoIliGlava == 1){
				glava++;

			}else {
				System.err.println("Greska!");
			}
			
			
			
		}
		System.out.printf("Pismo se pojavilo %d puta, a glava %d puta.", pismo, glava);

	}

}
