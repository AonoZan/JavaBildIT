public class _3_JumbledString {
	public static String cleanString(String string){
		String cleanedString = "";
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i) ) ) {
				cleanedString += string.charAt(i);
			}
		}
		return cleanedString;
	}
	public static void main(String[] args) {
		System.out.print("Unesite neku recenicu: ");
		String userString = Inputs.input.nextLine();
		Inputs.closeScanner();
		String cleanedUserString = cleanString(userString);
		System.out.println(cleanedUserString);
	}

}
