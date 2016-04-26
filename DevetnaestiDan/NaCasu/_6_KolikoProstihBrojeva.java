
public class _6_KolikoProstihBrojeva {
	public static boolean isPrime(int num){
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int howManyPrime(int from, int to){
		int howMany = 0;
		if (from <= 2) from = 2;
		for (int i = from; i <= to; i++) {
			if (isPrime(i)) howMany++;
		}
		return howMany;
	}
	public static void main(String[] args) {
		System.out.println("Unesite brojeve: ");
		int from = Inputs.input.nextInt();
		int to = Inputs.input.nextInt();
		int primesCount = howManyPrime(from, to);
		System.out.printf("Broj prostih brojeva u rasponu od %d do %d je: %d.\n", from, to, primesCount);
		
	}

}
