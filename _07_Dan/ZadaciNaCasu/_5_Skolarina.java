public class _5_Skolarina {

	public static void main(String[] args) {
		
		double skolarina = 10000; // novac
		double procenat = 5; //postotak
		int vrijeme = 10; //godina
		
		double ukupnaSkolarina = skolarina;
		
		for (int i = 0; i < vrijeme; i++) {
			ukupnaSkolarina = ukupnaSkolarina + ((ukupnaSkolarina / 100) * procenat);
			//System.out.println(ukupnaSkolarina);
		}
		
		System.out.printf("Ukupna skolarina za %d godina iznosi: %f", vrijeme, ukupnaSkolarina);
	}

}
