import java.util.Scanner;


public class _7_ObimPovrsina {
	public static double obim(double stranica){
		return 4 * stranica;
	}
	public static double povrsina(double stranica){
		return Math.pow(stranica, 2);
	}
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite duzinu stranice kvadrata u centimetrima: ");
		double duzinaStranice = 1.5;//unos.nextInt();
		unos.close();
		
		System.out.printf("Povrsina iznosi %.2fcm2, a obim %.2fcm.", povrsina(duzinaStranice), obim(duzinaStranice));
		
		
	}

}
