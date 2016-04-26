
public class _4_UpperCaseWords {
	public static String inputWordsUppercase(String string){
		String[] wordArray = string.split(" ");
		String stringUpper = "";
		for (int i = 0; i < wordArray.length; i++) {
			wordArray[i] = Character.toUpperCase(wordArray[i].charAt(0)) + wordArray[i].substring(1, wordArray[i].length());
			stringUpper += " " + wordArray[i];
		}
		return stringUpper;
	}
	public static void main(String[] args) {
		System.out.print("Unesite neku recenicu: ");
		String userString = Inputs.input.nextLine();
		Inputs.closeScanner();
		String userStringToUpper = inputWordsUppercase(userString);
		System.out.println(userStringToUpper);
	}

}
