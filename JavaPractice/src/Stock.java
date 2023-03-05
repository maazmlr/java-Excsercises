
public class Stock {
	private String symbol;
	private String name;
	private double pervClosingPrice;
	private double currentPrice;
	public String getSymbol() {
		return symbol;
	}
	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPervClosingPrice() {
		return pervClosingPrice;
	}
	public void setPervClosingPrice(double pervClosingPrice) {
		this.pervClosingPrice = pervClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
public double getChangePercentage()
{

}

}
