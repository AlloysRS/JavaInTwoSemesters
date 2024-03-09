package exercise3;

public class StockItem {
	private String stockNumber;
	private String name;
	private double price;
	private int totalStock = 0;
	static double salesTax = 0;
	
	public StockItem(String stockNumber, String name, double price)
	{
		this.stockNumber = stockNumber;
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void increaseTotalStock(int addStock)
	{
		this.totalStock += addStock;
	}
	
	public String getStockNumber()
	{
		return this.stockNumber;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getTotalStock()
	{
		return this.totalStock;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public double calculateTotalPrice()
	{
		return this.price * this.totalStock;
	}
	
	static void setSalesTax(double newSalesTax)
	{
		salesTax = newSalesTax;
	}
	
	
}
