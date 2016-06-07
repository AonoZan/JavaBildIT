import java.util.Scanner;


public class _5_StopeUMetre {
	public static double footToMeters(double foot){
		return foot * 0.305;
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite stope: ");
		double foot = 10;//unos.nextDouble();
		
		unos.close();
		
		System.out.printf("\n%.2f stopa je %.2f metara.", foot, footToMeters(foot));
		
		
	}

}
