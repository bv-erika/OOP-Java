package interfaces;

public interface Sellable {
	public static final int defaultprice = 1;
	public static final String defaultcurrency = "HUF";
	
	public default int getDefaultPrice() {
		return defaultprice;
	}
	
	public default String getDefaultCurrency() {
		return defaultcurrency;
	}
	
	public void setDefaultPrice();
	public void setDefaultCurrency();
}
