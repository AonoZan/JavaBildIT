/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class StockTest {
	public static void main(String[] args) {
		Stock oracleCorp = new Stock("ORCL", "Oracle Corporation");
		oracleCorp.currentPrice = 34.35;
		oracleCorp.previousClosingPrice = 34.5;
		System.out.println(oracleCorp.toString());
	}
}
