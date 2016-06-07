import java.util.Scanner;


public class _2_IsPrime {
	public static boolean isPrime(int n){
		for (int i = 2; i <= n/2; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite neki broj: ");
		int broj = 4;//unos.nextInt();
		
		unos.close();
		
		if(isPrime(broj)){
			System.out.println("Broj " + broj + " je prost.");
		}else {
			System.out.println("Broj " + broj + " nije prost.");
		}
		
		
	}

}
