/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class LongestCommonSubsequence1 {
	public static String forSequence = "";
	public static String forFinding = "";
	
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
//		Inputs.printArray(array);
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
		String reverse = "";
		for (int i = 0; i < string.length(); i++) {
			reverse += string.charAt(string.length()-1-i);
		}
		return reverse;
	}
	public static boolean isValid(String string) {
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
//		System.out.println(string.length() + "  " + found);
		if (string.length() == found) return true;
		else return false;
	}
	public static String largest(char[][] array) {
		String largest = "";
		for (int i = 0; i < array.length; i++) {
			String tmp = "";
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] != '_') tmp += array[i][j];
			}
			if(largest.length() < tmp.length() && isValid(tmp)) largest = tmp;
		}
		return largest;
	}
	public static String LCS() {
		char[][] oneTwo = join(getPatches(forSequence, forFinding), getPatches(reverse(forSequence), reverse(forFinding)));
//		System.out.println();
//		Inputs.printArray(oneTwo);
//		System.out.println(largest(oneTwo));
		
		char[][] twoOne = join(getPatches(forFinding, forSequence), getPatches(reverse(forFinding), reverse(forSequence)));
//		System.out.println();
//		Inputs.printArray(twoOne);
//		System.out.println(largest(twoOne));
		if(largest(oneTwo).length() > largest(twoOne).length()) return largest(oneTwo);
		else return largest(twoOne);
	}
	public static String randomString(int length, char from, char to) {
		String string = "";
		for (int i = 0; i < length; i++) {
			string += (char)(from + Math.random() * (to - from));
		}
		return string;
	}
	public static void main(String[] args) {
//		String str1 = "KAFSJDG";
//		String str2 = "JAGSKDF";
		
//		String str3 = "GDJSFAK";
//		String str4 = "FDKSGAJ";
		
//		System.out.println(LCS(str1, str2));
		
		//DAAACAB:BDABADB  (DAAAB)
//		forSequence = "DAAACAB";
//		forFinding = "BDABADB";
//		System.out.println(LCS());
		
//		forSequence = "XMGJYAPUZ";
//		forFinding = "PMZJAWXUG";
//		System.out.println(LCS());
		
//		forSequence = "KAFSJDGKAFSJDG";
//		forFinding = "JAGSKDFJAGSKDF";
//		System.out.println(LCS());
		
		for (int i = 0; i < 50; i++) {
			String one = randomString((int)(6 + Math.random() * 10), 'A', 'D');
			String two = randomString((int)(6 + Math.random() * 10), 'A', 'D');
			System.out.printf("%s:%s ", one, two);
			
			forSequence = one;
			forFinding = two;
			
			String lcs = LCS();
			System.out.printf("\n %s\n", lcs);
		}
//		LCS(str3, str4);
//		
//		System.out.println();
//		
//		LCS(str2, str1);
//		LCS(str4, str3);
		
// 		String str1 = "XMGJYAPUZ";
//		String str2 = "PMZJAWXUG";
//		
//		String str3 = "ZUPAYJGMX";
//		String str4 = "GUXWAJZMP";
 		
//		String str1 = "RZAGSDJEU";
//		String str2 = "JAUSDREZG";
//		
//		String str3 = "UEJDSGAZR";
//		String str4 = "GZERDSUAJ";
		
//		String str1 = "KAFSJDGKAFSJDG";
//		String str2 = "JAGSKDFJAGSKDF";
//		
//		String str3 = "GDJSFAKGDJSFAK";
//		String str4 = "FDKSGAJFDKSGAJ";
		
		/*
		System.out.println(LCS(str1, str2));
		System.out.println(LCS(str3, str4));
		
		System.out.println();
		
		System.out.println(LCS(str2, str1));
		System.out.println(LCS(str4, str3));*/
		
	}
}
