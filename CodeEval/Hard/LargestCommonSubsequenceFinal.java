import java.io.*;
public class LargestCommonSubsequenceFinal {
	public static String forSequence = "";
	public static String forFinding = "";
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            processLine(line);
        }
        buffer.close();
    }
	public static void processLine(String args) {
		String[] line = args.split(";");
		if(line.length < 2) return;
		forSequence = line[0];
		forFinding = line[1];
		System.out.println(LCS());
	}
	public static char[][] getPatches(String forSequence, String forFinding) {
		int index, length;
		if (forSequence.length() > forFinding.length()) length = forSequence.length();
		else length = forSequence.length();
		char[][] array = new char[length][length];
		
		for (int k = 0; k < forSequence.length(); k++) {
			for (int i = 0; i < k; i++) {
				array[k][i] = '_';
			}
			index = k;
			for (int i = k; i < forSequence.length(); i++) {
				boolean fix = true;
				for (int j = index; j < forFinding.length(); j++) {
					if (forSequence.charAt(i) == forFinding.charAt(j)) {
						array[k][i] = forSequence.charAt(i);
						fix = false;
						index = j + 1;
						break;
					}
				}
				if (fix) array[k][i] = '_';
			}
		}
		return array;
	}
	public static char[][] join(char[][] forward, char[][] reverse) {
		for (int i = 0; i < forward.length; i++) {
			for (int j = 0; j < forward[i].length; j++) {
				if (reverse[forward.length-1-i][forward[i].length-1-j] != '_') {
					forward[i][j] = reverse[forward.length-1-i][forward[i].length-1-j];
				}
			}
		}
		return forward;
	}
	public static String reverse(String string) {
		StringBuilder reverse = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			reverse.append(string.charAt(string.length()-1-i));
		}
		return reverse.toString();
	}
	public static boolean isValid(StringBuilder string) {
		int index = 0;
		int found = 0;
		for (int i = 0; i < string.length(); i++) {
			
			for (int j = index; j < forFinding.length(); j++) {
				if(string.charAt(i) == forFinding.charAt(j) && j < forFinding.length()) {
					index = j+1;
					found++;
					break;
				}
			}
		}
		if (string.length() == found) return true;
		else return false;
	}
	public static String largest(char[][] array) {
		StringBuilder largest = new StringBuilder();
		StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			tmp.setLength(0);
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] != '_') tmp.append(array[i][j]);
			}
			if(largest.length() < tmp.length() && isValid(tmp)) largest = tmp;
		}
		return largest.toString();
	}
	public static String LCS() {
		String oneTwo = largest(join(getPatches(forSequence, forFinding), getPatches(reverse(forSequence), reverse(forFinding))));
		String twoOne = largest(join(getPatches(forFinding, forSequence), getPatches(reverse(forFinding), reverse(forSequence))));
		if(oneTwo.length() > twoOne.length()) return oneTwo; else return twoOne;
//		return oneTwo;
	}
}


