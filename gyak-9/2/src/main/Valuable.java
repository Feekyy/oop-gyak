package main;

public interface Valuable
{
	int defaultPrice = 1;
	String PriceName = "Ft";

	int getDefaultPrice();
	String getPriceName();
	void setDefaultPrice(int defaultPrice);
	void setPriceName(String PriceName);

}
