package base;

public class Product {
	
	private String name;
	private int netprice;
	private int taxrate;
	
	public Product(String name, int netprice, int taxrate) {
		super();
		this.name = name;
		this.netprice = netprice;
		this.taxrate = taxrate;
	}

	public int getVatPrice() {
		return (netprice * taxrate) / 100;
	}
		
	public void raisePrice(int rate) {
		netprice += netprice * rate / 100;
	}
	
	public static int comparePrice(Product p1, Product p2) {
		if (p1.netprice > p2.netprice)
			return 1;
		else if (p1.netprice < p2.netprice)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", netprice=" + netprice + ", taxrate=" + taxrate + ", getVatPrice()="
				+ getVatPrice() + "]";
	}

	/* getter, setter methods */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNetprice() {
		return netprice;
	}

	public void setNetprice(int netprice) {
		this.netprice = netprice;
	}

	public int getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(int taxrate) {
		this.taxrate = taxrate;
	}
	
	

}
