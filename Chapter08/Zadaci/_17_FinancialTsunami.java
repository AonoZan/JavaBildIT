/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _17_FinancialTsunami {
	public static double totalOfBank(double[][] array){
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i][0];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("Enter number of banks and limit: ");
		int numberOfBanks = Inputs.input.nextInt();
		int limit = Inputs.input.nextInt();
		double[][][] banksList = new double[numberOfBanks][][];
		for (int i = 0; i < banksList.length; i++) {
			System.out.printf("Enter data for bank number %d: ", i+1);
			double bankMoney = Inputs.input.nextDouble();
			int numOfBorrowed = Inputs.input.nextInt();
			
			banksList[i] = new double[numOfBorrowed+1][2];
			banksList[i][0][0] = bankMoney;
			banksList[i][0][1] = numOfBorrowed;
			for (int j = 1; j <= numOfBorrowed; j++) {
				banksList[i][j][1] = Inputs.input.nextDouble();
				banksList[i][j][0] = Inputs.input.nextDouble();
			}
		}
		// 5 201
		// 25 2 1 100.5 4 320.5
		// 125 2 2 40 3 85
		// 175 2 0 125 3 75
		// 75 1 0 125
		// 181 1 2 125
		// 5 201 25 2 1 100.5 4 320.5 125 2 2 40 3 85 175 2 0 125 3 75 75 1 0 125 181 1 2 125
		for (int i = 0; i < banksList.length; i++) {
			for (int j = 1; j < banksList[i].length; j++) {
				double bankThatBorrowsSum = totalOfBank(banksList[(int)banksList[i][j][1]]);
				if (bankThatBorrowsSum >= limit) {
					banksList[i][0][0] += banksList[i][j][0];
				}
			}
		}
		System.out.println();
		System.out.println();
		/*for (int i = 0; i < banksList.length; i++) {
			for (int j = 0; j < banksList[i].length; j++) {
				for (int j2 = 0; j2 < banksList[i][j].length; j2++) {
					System.out.printf("%.2f ", banksList[i][j][j2]);
				}
				System.out.printf("\t");
			}
			System.out.println();
		}*/
		System.out.print("Unsafe banks are ");
		for (int i = 0; i < banksList.length; i++) {
			if (banksList[i][0][0] < limit) System.out.print(i+" ");
		}
	}

}
