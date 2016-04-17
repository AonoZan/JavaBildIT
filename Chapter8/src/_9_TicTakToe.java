
public class _9_TicTakToe {
	public static boolean gameOver = false;
	public static String winner = "";
	public static String[][] inputs = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
//	public static String[][] inputs = {{" ", "X", "X"}, {"O", "O", "X"}, {"X", "O", "X"}};
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();};
	public static void userMove(String[][] array, String player){
		String fixWord = "";
		int row = 0;
		int col = 0;
		while (true) {
			System.out.printf("%sEnter a row and column for player %s: ", fixWord, player);
			row = input.nextInt();
			col = input.nextInt();
			if (array[row-1][col-1] != " ") {
				fixWord = "Filled space. try again.\n";
			}else {
				break;
			}
		}
		array[row-1][col-1] = player;
	}
	public static boolean GameFinished(String[][] array){
		boolean noSpaces = true;
		String majorLeft = "";
		String majorRight = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("asd ");
				if (array[i][j] == " ") {
					noSpaces = false;
				}
			}
		}
		if (noSpaces) {
			winner = "... no one! :I";
			return true;
		}
		for (int i = 0; i < array.length; i++) {
			switch (array[0][i]+array[1][i]+array[2][i]) {
			case "XXX":
				winner = " X";
				return true;
			case "OOO":
				winner = " O";
				return true;
			}
			switch (array[i][0]+array[i][1]+array[i][2]) {
			case "XXX":
				winner = " X";
				return true;
			case "OOO":
				winner = " O";
				return true;
			}
			majorLeft+=array[i][i];
			majorRight+=array[array.length-1-i][array.length-1-i];
		}
		switch (majorLeft) {
		case "XXX":
			winner = " X";
			return true;
		case "OOO":
			winner = " O";
			return true;
		}
		switch (majorRight) {
		case "XXX":
			winner = " X";
			return true;
		case "OOO":
			winner = " O";
			return true;
		}
		return false;
	}
	public static void printScreen(String[][] array){
		System.out.printf("\n\n\n\n\n");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("-------------\n");
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("I %s ", array[i][j]);
			}
			System.out.println("I");
		}
		System.out.printf("-------------\n");
	}
	public static void playGame(){
		
		
		
		printScreen(inputs);
		if (gameOver) {return;}
		gameOver = GameFinished(inputs);
		userMove(inputs, "O");
		
		printScreen(inputs);
		if (gameOver) {return;}
		gameOver = GameFinished(inputs);
		userMove(inputs, "O");
		
	}
	public static void main(String[] args) {
		while (gameOver == false) {
			playGame();
		}
		System.out.printf("Winner is%s.", winner);
	}

}
