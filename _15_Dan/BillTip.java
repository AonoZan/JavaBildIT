
public class BillTip {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static double totalBill(double bill, double percent){
		return (bill + ((bill / 100) * percent));
	}
	public static void main(String[] args) {
		System.out.println("Unesite iznos racuna i procenat za napojnicu: ");
		double bill = input.nextDouble();
		double percent = input.nextDouble();
		System.out.printf("Ukupan racun iznosi %.4f.", totalBill(bill, percent));

	}

}
