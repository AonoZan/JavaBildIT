import java.util.Scanner;

public class TestSaburanja {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		int broj1 = (int) (Math.random() * 10);
		int broj2 = (int) (Math.random() * 10);
		
		int zbir = broj1 + broj2;
		
		//
		System.out.printf("Koliko je %d + %d?\n", broj1, broj2);
		
		int korisnickiUnos = unos.nextInt();

		while (korisnickiUnos != zbir){
			System.out.println("Zao mi je to nije tacno. Pokusajte ponovo.");
			korisnickiUnos = unos.nextInt();
			
		}
	
		
		unos.close();
		
		System.out.printf("Da! %d + %d jest jednako %d.", broj1, broj2, zbir);
	}

}
