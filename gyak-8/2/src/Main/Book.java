package Main;

public class Book extends Product 
{
	int pages;	
	
	@Override
	public double unitPrice() 
	{
		return BruttoPrice()/pages;
	}

	public Book(int nettoPrice, int taxPercent, int pages) {
		
		super("Book", nettoPrice, taxPercent);
		this.pages = pages;
	}
	
	

}
