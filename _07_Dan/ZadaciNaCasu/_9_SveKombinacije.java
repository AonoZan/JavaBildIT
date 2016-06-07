public class _9_SveKombinacije {

	public static void main(String[] args) {
		// tabela postupka
		// do while predstavlja kolonu a 
		// for loop predstavlja red u koloni
		// kombinacije sa _ su se vec ponovile
		// kombinacije sa * ne dolaze u obzir jer se zna da se javlja samo jedanput
		//     1      2      3      4      5      6      7
		// 1  1*1    2_1    3_1    4_1    5_1    6_1    7_1
		// 2  1 2    2*2    3_2    4_2    5_2    6_2    7_2
		// 3  1 3    2 3    3*3    4_3    5_3    6_3    7_3
		// 4  1 4    2 4    3 4    4*4    5_4    6_4    7_4
		// 5  1 5    2 5    3 5    4 5    5*5    6_5    7_5
		// 6  1 6    2 6    3 6    4 6    5 6    6*6    7_6
		// 7  1 7    2 7    3 7    4 7    5 7    6 7    7*7
		// do while ce raditi dok god ne bude jednak trenutni sa maksimalnim
		
		int maksimalniBroj = 7;
		int trenutniBroj = 1;
		
		do {
			for (int i = 1; i <= maksimalniBroj; i++) {
				if (i > trenutniBroj) {
					System.out.print(trenutniBroj + " " + i + ", ");
				}
			}
			trenutniBroj++;
		} while (trenutniBroj < maksimalniBroj);
		
	}

}
