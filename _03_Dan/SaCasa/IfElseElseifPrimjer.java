package NaCasuPisano;
public class IfElseElseifPrimjer {

	public static void main(String[] args) {
		int broj = 100;
		
		if (broj <= 0) {
			System.out.println("Molimo vas unesite broj veci od 0");
		}
		else if (broj >= 100) {
			System.out.println("Molimo unesite broj manji od 100");
		
		} else {
			System.out.println("Unjeli ste broj " + broj);
		}
	}

}
