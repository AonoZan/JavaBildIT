/**@autor AonoZan Dejan Petrovic 2016 ©
 */
/*
 * 
 */
public class LongestCommonSubsequence {
	
	public static String LCS(String forSequence, String forFinding) {
 		String tmp = "";
		String tmp1 = "";
		int index = 0;
		for (int k = 0; k < forSequence.length(); k++) {
			tmp = "";
			index = 0;
			for (int j = 0; j < k; j++) {
				tmp += "_:";
			}
			for (int i = k; i < forSequence.length(); i++) {
				
				boolean fix = true;
				for (int j = index; j < forFinding.length(); j++) {
					if (forSequence.charAt(i) == forFinding.charAt(j)) {
						tmp += forSequence.charAt(i)+":";
						index = j + 1;
						fix = false;
						break;
					}
				}
				if (fix) {
					tmp += "_:";
				}
				
			}
			if(tmp.length() > tmp1.length()) tmp1 = tmp;
			System.out.printf("%2d:(%c) I:%" + forSequence.length()*2 + "sI   -   I:%" + forSequence.length()*2 + "sI\n", k, forSequence.charAt(k), tmp, tmp1);
		}
		System.out.println();
		return tmp1;
	}
	
	public static void main(String[] args) {
		
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
		
		String str1 = "KAFSJDG";
		String str2 = "JAGSKDF";
		
		String str3 = "GDJSFAK";
		String str4 = "FDKSGAJ";
		
//		String str1 = "KAFSJDGKAFSJDG";
//		String str2 = "JAGSKDFJAGSKDF";
//		
//		String str3 = "GDJSFAKGDJSFAK";
//		String str4 = "FDKSGAJFDKSGAJ";
		
		LCS(str1, str2);
		LCS(str3, str4);
		
		System.out.println();
		
		LCS(str2, str1);
		LCS(str4, str3);
		
		/*
		System.out.println(LCS(str1, str2));
		System.out.println(LCS(str3, str4));
		
		System.out.println();
		
		System.out.println(LCS(str2, str1));
		System.out.println(LCS(str4, str3));*/
		
	}
}
