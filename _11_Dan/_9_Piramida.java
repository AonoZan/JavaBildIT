import java.util.Scanner;


public class _9_Piramida {
	public static void displayPattern(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("    ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.printf("%3d ",  j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite velicinu piramide u obliku broja: ");
		int velicinaPiramide = 20;//unos.nextInt();
		unos.close();
		displayPattern(velicinaPiramide);
		
		
	}

}
