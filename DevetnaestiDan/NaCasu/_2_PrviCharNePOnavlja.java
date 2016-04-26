
public class _2_PrviCharNePOnavlja {
	public static char findFirst(String string){
		char character = string.charAt(0);
		for (int i = 1; i < string.length(); i++) {
			if (character != string.charAt(i)) {
				character = string.charAt(i);
				break;
			}
		}
		return character;
	}
	public static void main(String[] args) {
		System.out.print("Unesite neki string: ");
		String string = Inputs.input.next();
		Inputs.closeScanner();
		char firstChar = findFirst(string);
		System.out.printf("Prvi karakter koji se ne ponavlja je %c.", firstChar);

	}

}
