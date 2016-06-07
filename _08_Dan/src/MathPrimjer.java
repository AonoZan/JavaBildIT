public class MathPrimjer {
	public static void main(String[] args) {
		double prviBroj = 77;
		int drugiBroj = 7;
		int treciBroj = 14;
		
		double korjenBroja = Math.sqrt(prviBroj);
		System.out.printf("Korjen broja %f je %f.\n", prviBroj, korjenBroja);
		
		System.out.printf("Zaoklruzen broj %f je %d.\n", korjenBroja, Math.round(korjenBroja));
		
		double kvadratBroja = Math.pow(drugiBroj, 2);
		System.out.printf("Kvadrat broja %d iznosi %f.\n", drugiBroj, kvadratBroja);
		
		System.out.printf("Sta je vece %d ili %d? %d\n", drugiBroj, treciBroj, Math.max(drugiBroj, treciBroj));
		System.out.printf("Sta je manje %d ili %d? %d\n", drugiBroj, treciBroj, Math.min(drugiBroj, treciBroj));
	}

}
