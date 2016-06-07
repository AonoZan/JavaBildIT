/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestBank {

	public static void main(String[] args) {
		Bank banka = new Bank();
		String[] names = {
				"Nikola",
				"Slaven",
				"Neven",
				"Petar",
				"Moamer",
				"Dejan",
				"Ivana",
				"Maja",
				"Jasmina",
				"Cvijetin",
				"Tijana"
		};
		double[] balances = {
				200,
				200,
				200,
				200,
				200,
				200,
				200,
				200,
				200,
				200,
				200
		};
		for (int i = 0; i < names.length; i++) {
			banka.createAccount(names[i], balances[i]);
		}
		
		System.out.println(banka.toString());
		
		banka.transferMoney(4, 10, 200);
		banka.transferMoney(4, 10, 200);
		banka.transferMoney(1, 8, -100);
	}

}
