import java.util.Scanner;

public class _21_FutureInvestmentValue {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// get all inputs
		System.out.println("Enter investment amount:");
		double investmentAmount = 1000.56;//unos.nextDouble();
		
		// get all inputs
		System.out.println("Enter annual interest rate in percentage:");
		double interestRate = 4.25;//unos.nextDouble();
		
		// get all inputs
		System.out.println("Enter number of years:");
		double numberOfYears = 1;//unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj 1.043335732
		double monthlyIntrestRate = (investmentAmount * (interestRate/1200.0))/1000.0;
		double futureInvestmentValue = investmentAmount * Math.pow((1+monthlyIntrestRate), numberOfYears*12.0);

		// serviraj rezultat
		System.out.printf("Accumulated value is %.2f", futureInvestmentValue);

	}

}
