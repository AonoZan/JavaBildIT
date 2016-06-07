/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public double getChangePercent() {
		return (currentPrice / 100) * (currentPrice - previousClosingPrice);
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
