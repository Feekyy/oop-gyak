package main;

public class Estate implements Valuable
{
	int price;
	String priceName;
	int size;
	String location;

	public Estate(int price, int size, String location)
	{
		this.price = price;
		this.size = size;
		this.location = location;
		this.priceName = Valuable.PriceName;
	}

	@Override
	public int getDefaultPrice()
	{
		return this.price;
	}

	@Override
	public String toString() {
		return "Estate [price=" + price + ", priceName=" + priceName + ", size=" + size + ", location=" + location
				+ "]";
	}

	@Override
	public String getPriceName()
	{
		return this.priceName;
	}

	@Override
	public void setDefaultPrice(int defaultPrice)
	{
		this.price = defaultPrice;
	}

	@Override
	public void setPriceName(String PriceName)
	{
		this.priceName = PriceName;
	}

	public int EstatePrice()
	{
		return this.size*this.price;
	}


}
