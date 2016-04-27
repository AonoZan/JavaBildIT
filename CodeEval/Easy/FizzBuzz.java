/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class FizzBuzz {
	// function for printing fizz n buzz sequences in a given range
	public static void printFizzBuzz(int argumentOne, int argumentTwo, int range){
		for (int i = 1; i <= range; i++) {
			String printString = "";											// Create print string
			if (i % argumentOne == 0) printString += "F";						// and if no reminder with first argument
			if (i % argumentTwo == 0) printString += "B";						// or second add "F" or "B"
			if (i % argumentOne != 0 && i % argumentTwo != 0) printString += i;	// in case both have reminder just add current number (i)
			System.out.print(printString + " ");								// print with space
		}
	}
	public static void main(String[] args) {
		printFizzBuzz( 3, 5, 15);
	}

}
