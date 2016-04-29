//Sample code to read in test cases:
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            processLine(line);
        }
        buffer.close();
    }
	// function for printing fizz n buzz sequences in a given range
	public static void printFizzBuzz(int argumentOne, int argumentTwo, int range){
		for (int i = 1; i <= range; i++) {
			String printString = "";											// Create print string
			if (i % argumentOne == 0) printString += "F";						// and if no reminder with first argument
			if (i % argumentTwo == 0) printString += "B";						// or second add "F" or "B"
			if (i % argumentOne != 0 && i % argumentTwo != 0) printString += i;	// in case both have reminder just add current number (i)
			System.out.print(printString + " ");								// print with space
		}
		System.out.println();
	}
	public static void processLine(String args) {
		String[] line = args.split(" ");
	    int argumentOne = Integer.valueOf(line[0]);
	    int argumentTwo = Integer.valueOf(line[1]);
	    int range = Integer.valueOf(line[2]);
		printFizzBuzz( argumentOne, argumentTwo, range);
	}

}

