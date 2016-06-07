public class CharPrimjer {
	public static void main(String[] args) {
		char slovo = 'a';
		
		System.out.println("Da li je 'a' broj? " + Character.isDigit(slovo));
		System.out.println("Da li je 'a' slovo? " + Character.isLetter(slovo));
		System.out.println("Da li je 'a' malo slovo? " + Character.isLowerCase(slovo));
		System.out.println("Da li je 'a' veliko slovo? " + Character.isUpperCase(slovo));
		System.out.println("Slovo 'T' pretvori u malo slovo. " + Character.toLowerCase('T'));
		System.out.println("Slovo 'q' pretvori u veliko slovo.? " + Character.toUpperCase('q'));
		
		//String i = "a";
		//System.out.println((i * 7));
		
		
	}

}
