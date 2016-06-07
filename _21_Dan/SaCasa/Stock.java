/**@autor AonoZan Dejan Petrovic 2016 ©
 */
/*UML
 * 		Stock
 *  + symbol: String
 *  + name: String
 *  + previousClosingPrice: double
 *  + currentPrice: double
 *  
 *  + Stock(symbol: String, name: String)
 *  + getChangePercent(): double
 */

public class Stock {
	public String symbol;
	public String name;
	public double previousClosingPrice;
	public double currentPrice;
	
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercent() {
		return (this.previousClosingPrice / 100) * (this.currentPrice - this.previousClosingPrice);
	}
	public String toString() {
		return "Name: " +
				this.name + 
				"\nSymbol: " +
				this.symbol +
				"\nPercent change: " +
				getChangePercent() +
				"%\n";
	}
}
