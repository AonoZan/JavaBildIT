/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class StockTest {

	public static void main(String[] args) {
		Stock javaCorp = new Stock("ORCL", "Oracle Corporation");
		javaCorp.setCurrentPrice(34.355);
		javaCorp.setPreviousClosingPrice(34.5);
		
		System.out.println(javaCorp.toString());
	}

}
