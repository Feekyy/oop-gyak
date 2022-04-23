package Main;

public abstract class Product
{
    String name;
    int nettoPrice;
    int taxPercent;

    public Product(String name, int nettoPrice, int taxPercent)
    {
		this.name = name;
		this.nettoPrice = nettoPrice;
		this.taxPercent = taxPercent;
	  }

    public int BruttoPrice()
    {
      return Math.round(nettoPrice*(taxPercent/100)+nettoPrice);
    }

	@Override
	public String toString()
  {
		return "Product [name=" + name + ", BruttoPrice()=" + BruttoPrice() + "]";
	}

  public void IncPrice(int percent)
  {
    this.nettoPrice = (int)(nettoPrice + (nettoPrice*(percent/100)));
  }

  public int CompareBrutto(Product prd)
  {
    if (BruttoPrice() > prd.BruttoPrice()) return 1;
    else if (BruttoPrice() == prd.BruttoPrice()) return 0;
    else return -1;
  }
  
  public abstract double unitPrice();

}
