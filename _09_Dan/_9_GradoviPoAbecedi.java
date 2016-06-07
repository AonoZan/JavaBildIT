import java.util.Scanner;

public class _9_GradoviPoAbecedi {

			public static void main(String[] args) {
				// create scanner
				Scanner unos = new Scanner(System.in);
				
				System.out.print("Unesite imena tri grada.\nUnesite ime prvog grada:");
				
				//String grad = ""; //unos.nextLine();
				//String gradoviPoAbecedi = "";
				
//				while (true) {
//					String grad = "Doboj"; //unos.nextLine();
//					if (condition) {
//						
//					}
//				}
				
				String grad1 = "Doboj"; //unos.nextLine();
				System.out.print("\nUnesite ime drugog grada: ");
				String grad2 = "Banja Luka"; //unos.nextLine();
				System.out.print("\nUnesite ime treceg grada: ");
				String grad3 = "Stanari";//unos.nextLine();
				System.out.println();
				
				unos.close();
				
				String gradoviPoAbecedi = "";
				
				if (grad1.compareToIgnoreCase(grad2) < 0 && grad1.compareToIgnoreCase(grad3) < 0 ) {
					gradoviPoAbecedi += grad1 + ", ";
					if (grad2.compareToIgnoreCase(grad3) < 0) {
						gradoviPoAbecedi += grad2 + ", " + grad3;
					}else {
						gradoviPoAbecedi += grad3 + ", " + grad2;
					}
					
				}else if(grad2.compareToIgnoreCase(grad1) < 0 && grad2.compareToIgnoreCase(grad3) < 0 ){
					gradoviPoAbecedi += grad2 + ", ";
					if (grad1.compareToIgnoreCase(grad3) < 0) {
						gradoviPoAbecedi += grad1 + ", " + grad3;
					}else {
						gradoviPoAbecedi += grad3 + ", " + grad1;
					}
					
				}else {
					gradoviPoAbecedi += grad3 + ", ";
					if (grad2.compareToIgnoreCase(grad1) < 0) {
						gradoviPoAbecedi += grad2 + ", " + grad1;
					}else {
						gradoviPoAbecedi += grad1 + ", " + grad2;
					}
					
				}
				
				System.out.println("Gradovi po abecedi su: " + gradoviPoAbecedi + ".");
					
		
	}
}
