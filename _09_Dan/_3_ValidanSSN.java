import java.util.Scanner;

public class _3_ValidanSSN {

			public static void main(String[] args) {
				// create scanner
				Scanner unos = new Scanner(System.in);
				
				System.out.print("Unesite svoj SSN (XXX-XX-XXXX): ");
				String socialSecurityNumber = "232-23-2345"; //unos.next();
				System.out.println();
				
				boolean isValidSSN = false;
				
				unos.close();
				
				
				for (int i = 0; i < 11; i++) {
					if (Character.isDigit(socialSecurityNumber.charAt(i)) || socialSecurityNumber.charAt(i) == '-') {
						//System.out.println(socialSecurityNumber.charAt(i));
						isValidSSN = true;
					}else {
						isValidSSN = false;
						break;
					}
				}
				
				if (isValidSSN) {
					System.out.printf("%s je validan SSN.", socialSecurityNumber);
				}
				
		
	}
}
