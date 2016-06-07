import java.util.Scanner;


public class _6_Tabela {
	public static void header(){
		System.out.print("i \t m(i)\n--------------\n");
	}
	public static double formula(int x){
		double zbir = 0;
		for (int i = 1; i <= x; i++) {
			zbir = zbir + (i/(i+1.0));
		}
		return zbir;
	}
	public static void body(int x){
		for (int i = 0; i <= x; i++) {
			System.out.printf("%2d\t%6.4f\n", i, formula(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite velicinu tabele u obliku cijelog broja: ");
		int velicinaTabele = 20; //unos.nextInt();
		unos.close();
		
		 header();
		 body(velicinaTabele);
		 
		
		
	}

}
