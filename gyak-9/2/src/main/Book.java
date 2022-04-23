package main;

public class Book extends Product
{
	public Book(String name, int netPrice, int aKey, String author, String title, int price, int pages)
	{
		super(name, netPrice, aKey);
		this.author = author;
		this.title = title;
		this.yearOfPublication = 2000;
		this.price = price;
		this.pages = pages;
	}
	private String author;
	private String title;
	private final int yearOfPublication;
	private int price;
	private int pages;

	public int bruttoPrice()
	{
		return super.grossPrice()/pages;
	}

}
