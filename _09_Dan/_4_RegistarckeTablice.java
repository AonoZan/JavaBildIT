public class _4_RegistarckeTablice {

			public static void main(String[] args) {
				// 65 90
				
				String tablice = "";
				int nasumicniKarakter = 0;
				
				for (int i = 0; i < 9; i++) {
					
					if (i < 4) {
						nasumicniKarakter = 65 + (int)(Math.random() * 26 );
						tablice += (char)nasumicniKarakter;
					}else if (i == 5) {
						tablice += "-";
					}else if (i > 5){
						nasumicniKarakter = (int)(Math.random() * 10) ;
						tablice += nasumicniKarakter;
					}
				}
				
				System.out.printf("Vas registarcki broj tablica je %s.", tablice);
		
	}
}
