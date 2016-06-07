/**
 * @autor AonoZan Dejan Petrovic 2016
 */
public class _22_EightQueens {
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
		int tableSize = 64;								// table size (enter number as desired)
		char[][] table = new char[tableSize][tableSize];// table created
		boolean found;									// if correct table is found this will exit loop
		int solutions;									// counter to store number of random solutions per each line
		int attempts = 0;								// counter to store number of attempts to find whole table
		do {											// do this until correct table is found
			fillArray(table, '_');						// fill table with some char for esthetic reasons
			solutions = 0;								// create/reset number of solutions per single line
			found = true;								// found is true unless something say its not
			for (int i = 0; i < tableSize; i++) {		// loop for every line in table
				boolean rightSpot;						// create boolean variable to store if we have right spot available on current line
				do {									// check current line for available spot to land queen
					int x = i;									// first index for table is current line stored in for loop (i)
					int y = (int)(Math.random() * tableSize);	// second index is generated randomly based on table length
					boolean slash = false;						// boolean to store if there is no other queen diagonally (top right to bottom left)
					boolean backSlash = false;					// boolean to store if there is no other queen diagonally (top left to bottom right)
					rightSpot = true;							// we found right spot unless otherwise
					for (int i1 = x, j1 = y, i2 = x, j2 = y; true; i1++, j1--, i2++, j2++) {
						
						if (i1 == tableSize) {int tmp = i1; i1 = j1+1;j1 = tmp-1;}	// if first index for top right diagonally reaches end reset to beginning
						else if (j1 == -1) {int tmp1 = j1; j1 = i1-1; i1 = tmp1+1;}	// if second index for top right diagonally reaches beginning reset to end
						if (i2 == tableSize) {i2 -= j2; j2 = 0;}					// if first index for top left diagonally reaches end reset to beginning
						else if (j2 == tableSize) {j2 -= i2; i2 = 0;}				// if second index for top left diagonally reaches end reset to beginning
						
						if (table[i1][j1] == 'Q' || table[i2][j2] == 'Q') {rightSpot = false; break;} // if other queen is found on any of current indexes we have'nt found right spot, break
						
						if (i1+1 == x && j1-1 == y || y == tableSize-1 && j1 == y)slash = true;		// if we reach same indexes (on top right to bottom left diagonal)
																									// in this loop as initial indexes for spot
																									// or first and current first index is last in row
						if (i2+1 == x && j2+1 == y || y == 0 && j1 == y)backSlash = true;			// if we reach same indexes (on top left to bottom right diagonal)
																									// in this loop as initial indexes for spot
																									// or second and current first index is first in row
						if (slash && backSlash || x == 0) break;									// if on both left and right diagonal no other queen is found break
					}
					for (int row = 0; row < tableSize; row++) {												// for every row
						for (int col = 0; col < tableSize; col++) {											// and for every column in row
							if (table[x][col] == 'Q' || table[col][y] == 'Q') {rightSpot = false; break;}	// if any queen both horisontaly and verticaly
						}																					// no right spot, break
					}
					solutions++;												// count number of solutions for current line
					if (rightSpot) {table[x][y] = 'Q';}							// if we have right spot, land queen
				} while (!rightSpot && solutions < tableSize * 64);						// if we don't have right spot try again until number of solutions reaches 200
				if (solutions >= 200) {found = false; break;}else solutions = 0;// if number of solutions for given line is 200(or more)
			}																	// we haven't started correct combination, restart and try again
																				// else we have found correct position and restart number of solutions
			attempts++;												// new attempt of table creations (add one to counter)
			System.out.printf("Checking table %3d.\n", attempts);	// print current table attempt number
		} while (!found);											// if correct table is not fount (found false) it will run while false
		
		for (int i = 0; i < table.length; i++) {	// for every row in table
			for (char j : table[i]) {				// and for each in row
				System.out.print("."+j);			// print dot and each
			}
			System.out.println(". ::");				// print dot at the end of every row
		}
	}	
}
// this is how loop goes trough array to see if any other queen is on way for that spot
// if it find´s any other queen on "=" and "x" places rightSpot is false, restart until solutions reaches 200
//------------------------------------------------------------
//  index 1 2
//  0:1:2:3:4:5:6:7      1 0    //  0:1:2:3:4:5:6:7
//0:_ _ = _ _ _ _ _  0 2 1 1    //0:_ = _ x _ _ _ _ 0 1 0 3
//1:x x Q x x x x x  1 2 1 2 >  //1:_ _ Q _ _ _ _ _	1 2 1 2 > (from here it starts to check)
//2:_ _ = _ _ _ _ _  2 2 1 3    //2:_ x _ = _ _ _ _	2 3 2 1
//3:_ _ = _ _ _ _ _  3 2 1 4    //3:x _ _ _ = _ _ _	3 4 3 0.
//4:_ _ = _ _ _ _ _  4 2 1 5    //4:_ _ _ _ _ = _ _ 4 5
//5:_ _ = _ _ _ _ _  5 2 1 6    //5:_ _ _ _ _ _ = _ 5 6
//6:_ _ = _ _ _ _ _  6 2 1 7.   //6:_ _ _ _ _ _ _ = 6 7.
//7:_ _ = _ _ _ _ _  7 2.       //7:_ _ _ _ _ _ _ _
//------------------------------------------------------------