package myproducts;

public class Bread extends Product
{
	double ammount;

	public Bread(String name, int nettoPrice, int taxPercent, double ammount)
	{
		super(name, nettoPrice, taxPercent);
		this.ammount = ammount;
	}

	@Override
	public String toString() {
		return "Bread [name=" + name + ", nettoPrice=" + nettoPrice + ", bruttoPrice: " + BruttoPrice() + ", unitPrice: " + UnitPrice()  +"]";
	}

	public double UnitPrice()
	{
		return ammount/BruttoPrice();
	}

	public double getAmmount()
	{
		return ammount;
	}

	public static boolean CompareBreads(Bread bread1, Bread bread2)
	{
		if (bread1.UnitPrice() > bread2.UnitPrice()) return true;
		else return false;
	}

}
