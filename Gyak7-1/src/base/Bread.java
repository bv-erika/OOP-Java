package base;

public class Bread extends Product {
	
	private double amount;

	public Bread(String name, int netprice, int taxrate, double amount) {
		super(name, netprice, taxrate);
		this.amount = amount;
	}
	
	public double getUnitPrice() {
		return getVatPrice() / amount;
	}

	@Override
	public String toString() {
		return "Bread [amount=" + amount + ", getUnitPrice()=" + getUnitPrice() + ", getName()=" + getName()
				+ ", getNetprice()=" + getNetprice() + "]";
	}
	
	public static int compareUnitPrice(Bread b1, Bread b2) {
		if (b1.getUnitPrice() > b2.getUnitPrice())
			return 1;
		else if (b1.getUnitPrice() < b2.getUnitPrice())
			return -1;
		else
			return 0;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
