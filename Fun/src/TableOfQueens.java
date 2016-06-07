/**
 * @autor Dejan Petrovic 2016
 */
public class TableOfQueens {
	// method that fills array with provided default values
	public static void fillArray(char[][] array, char filler){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = filler;
			}
		}
	}
	// main method
	public static void main(String[] args) {

		char[][] table = new char[8][8];
		boolean found;
		int solutions;
		int tableSize = table.length;
		int attempts = 0;
		do {
			
			fillArray(table, '_');
			solutions = 0;
			found = true;
			for (int i = 0; i < tableSize; i++) {
				boolean rightSpot;
				do {
					int x = i;
					int y = (int)(Math.random() * tableSize);
//					System.out.printf("%d %d\n", x, y);
					boolean slash = false;
					boolean backSlash = false;
					rightSpot = true;
					for (int i1 = x, j1 = y, i2 = x, j2 = y; true; i1++, j1--, i2++, j2++) {
//						System.out.printf("%d %d, %d %d: %b %b\n", i1, j1, i2, j2, slash, backSlash);
						if (i1 == tableSize) {int tmp = i1; i1 = j1+1;j1 = tmp-1;}
						else if (j1 == -1) {int tmp1 = j1; j1 = i1-1; i1 = tmp1+1;};
						
						if (i2 == tableSize) {i2 -= j2; j2 = 0;}
						else if (j2 == tableSize) {j2 -= i2; i2 = 0;}
						
						if (table[i1][j1] == 'Q' || table[i2][j2] == 'Q') {rightSpot = false; break;}
//						System.out.printf("%d %d, %d %d: %b %b\n", i1, j1, i2, j2, slash, backSlash);
//						if (!slash)System.out.print(i1 + " " + j1 + "  ");
						if (i1+1 == x && j1-1 == y || y == tableSize-1 && j1 == y)slash = true;//|| i1 == 0 || j2 == tableSize-1) slash = true;
//						if (!backSlash)System.out.print(i2 + " " + j2 + "  ");
						if (i2+1 == x && j2+1 == y || y == 0 && j1 == y)backSlash = true;//|| i2 == tableSize-1 || j1 == tableSize-1) backSlash = true;
//						System.out.println();
//						System.out.println(slash + " " + backSlash);
//						System.out.printf("%d %d, %d %d: %b %b\n", i1, j1, i2, j2, slash, backSlash);
//						System.out.println();
						
						if (slash && backSlash || x == 0) break;
//						System.out.printf("i=%d solutions=%d\n", i, solutions);
//						if (solutions > 5000) {found = false; break;}
					}
					for (int row = 0; row < tableSize; row++) {
						for (int col = 0; col < tableSize; col++) {
							if (table[x][col] == 'Q' || table[col][y] == 'Q') {rightSpot = false; break;}
						}
					}
					solutions++;
					if (rightSpot) {table[x][y] = 'Q';}
				} while (!rightSpot && solutions < 200);
				if (solutions >= 200) {found = false; break;}else solutions = 0;
			}
			attempts++;
			System.out.printf("Try number %3d.\n", attempts);
		} while (!found);

		for (int i = 0; i < table.length; i++) {
			for (char j : table[i]) {
				System.out.print("."+j);
			}
			System.out.println(". ::");
		}
	}

}

// Idealna tabla
// Nijedna kraljica ne moze da unisti drugu kraljicu
// Q _ _ _ _ _ _ _ 
// _ _ Q _ _ _ _ _
// _ _ _ _ Q _ _ _
// _ _ _ _ _ _ Q _
// _ Q _ _ _ _ _ _
// _ _ _ Q _ _ _ _
// _ _ _ _ _ Q _ _
// _ _ _ _ _ _ _ Q

// Primjer kako bi kod trebao da prodje kroz dvodimenzionalni niz i
// provjeri da li postoji neka kraljica vec na tabli, a koja bi mogla da unisti novu.
// Ako postoji, kod bira ponovo neko drugo mjesto i prolazi ponovo provjeru sve dok ne nadje pogodno mjesto

// Kreira se 8x8 niz
// Kod bira nasumicno indekse 1 i 2, 5 i 3, 2 i 6 
// ljevi primjer:
// prolazi kroz sve horizontale i vertikale
// posto je u ovom slucaju poznato da je uvjek isti broj horizontala i vertikala
// kod ce proci uvjek taj broj puta
// desni primjer:
// potom ljevu i desnu dijagonalu
// u ovom slucaju nikad nije fiksna duzina loopa
// loop bi trebao da radi dok ga nesto zavrsi (break;)
// loop zavrsava u slucaju da indeksi za ljevu i desnu dijagonalu dodju na prvobitne vrjednosti npr. 1 i 2
// ako na bilo kojem od ovih mjesta nadje drugu kraljicu prekida operaciju
// ako ne pronadje, kraljica moze da stane na tablu
// sve se ponavlja za onoliko kraljica kolika je duzina table
//
//Legenda: 
// ">" znaci da loop krece odavde i zavrsava na ovom mjestu
// ako loop ne zavrsi prije to znaci da je to mjesto slobodno da kraljica zauzme
// "." znaci da su se indeksi promjenili na tom mjestu
//------------------------------------------------------------
// indekasi 1 2
//  0:1:2:3:4:5:6:7      1 0    //  0:1:2:3:4:5:6:7
//0:_ _ = _ _ _ _ _  0 2 1 1    //0:_ = _ x _ _ _ _ 0 1 0 3
//1:x x Q x x x x x  1 2 1 2 >  //1:_ _ Q _ _ _ _ _	1 2 1 2 > (pocetna i zavrsna tacka u loop-u)
//2:_ _ = _ _ _ _ _  2 2 1 3    //2:_ x _ = _ _ _ _	2 3 2 1
//3:_ _ = _ _ _ _ _  3 2 1 4    //3:x _ _ _ = _ _ _	3 4 3 0.
//4:_ _ = _ _ _ _ _  4 2 1 5    //4:_ _ _ _ _ = _ _ 4 5
//5:_ _ = _ _ _ _ _  5 2 1 6    //5:_ _ _ _ _ _ = _ 5 6
//6:_ _ = _ _ _ _ _  6 2 1 7.   //6:_ _ _ _ _ _ _ = 6 7.
//7:_ _ = _ _ _ _ _  7 2.       //7:_ _ _ _ _ _ _ _
//------------------------------------------------------------
// indeksi 5 3           
//  0:1:2:3:4:5:6:7				//  0:1:2:3:4:5:6:7
//0:_ _ _ = _ _ _ _  0 3        //0:_ _ _ _ _ _ _ _
//1:_ _ _ = _ _ _ _  1 3        //1:_ _ _ _ _ _ _ x     1 7
//2:_ _ _ = _ _ _ _  2 3 5 0    //2:= _ _ _ _ _ x _ 2 0 2 6
//3:_ _ _ = _ _ _ _  3 3 5 1    //3:_ = _ _ _ x _ _ 3 1 3 5
//4:_ _ _ = _ _ _ _  4 3 5 2    //4:_ _ = _ x _ _ _ 4 2 4 4
//5:x x x Q x x x x  5 3 5 3    //5:_ _ _ Q _ _ _ _ 5 3 5 3 >
//6:_ _ _ = _ _ _ _  6 3 5 4    //6:_ _ x _ = _ _ _ 6 4 6 2
//7:_ _ _ = _ _ _ _  7 3.5 5    //7:_ x _ _ _ = _ _ 7 5.7 1. 
//						 5 6     
//						 5 7.   
// -----------------------------------------------------------
//						 2 0
//						 2 1
// indeksi 2 6			 2 2    
//  0:1:2:3:4:5:6:7      2 3    //  0:1:2:3:4:5:6:7
//0:_ _ _ _ _ _ = _  0 6 2 4    //0:_ _ _ _ = _ _ _ 0 4
//1:_ _ _ _ _ _ = _  1 6 2 5    //1:_ _ _ _ _ = _ x 1 5 1 7
//2:x x x x x x Q x  2 6 2 6    //2:_ _ _ _ _ _ Q _ 2 6 2 6 >
//3:_ _ _ _ _ _ = _  3 6 2 7.   //3:_ _ _ _ _ x _ = 3 7.3 5 
//4:_ _ _ _ _ _ = _  4 6 	    //4:_ _ _ _ x _ _ _		4 4
//5:_ _ _ _ _ _ = _  5 6		//5:_ _ _ x _ _ _ _		5 3
//6:_ _ _ _ _ _ = _  6 6		//6:_ _ x _ _ _ _ _		6 2
//7:_ _ _ _ _ _ = _  7 6.       //7:_ x _ _ _ _ _ _		7 1.

//
//0:1:2:3:4:5:6:7
//0:_ _ _ _ _ _ _ _
//1:_ _ _ _ _ _ _ _
//2:_ _ _ _ _ _ _ _
//3:_ _ _ _ _ _ _ _
//4:_ _ _ _ _ _ _ _
//5:_ _ _ _ _ _ _ _
//6:_ _ _ _ _ _ _ _
//7:_ _ _ _ _ _ _ _