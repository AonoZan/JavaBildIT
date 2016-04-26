/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _10_PoslednjiKarakter {

	public static void main(String[] args) {
		System.out.println("Unesite string i karakter: ");
		String userString = Inputs.input.nextLine();
		String charToMatch = userString.substring(userString.length()-1, userString.length());
		System.out.println(charToMatch);
		userString = userString.substring(0, userString.length()-1);
		int lastCharIndex = 0;
		for (int i = 0; i < userString.length(); i++) {
			System.out.println(userString.substring(i, i+1) + " " + charToMatch);
			if (userString.substring(i, i+1).equals(charToMatch)) lastCharIndex = i;
		}
		System.out.println(lastCharIndex);
	}

}
