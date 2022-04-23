package main;

import java.awt.Color;

public class Pen extends Product implements Colorable
{
	private Color color;
	private String brand;
	
	public Pen(String brand, Color color, int price)
	{
		super("Pen", price, 27);
		this.brand = brand;
		this.color = color;
	}

	@Override
	public Color getColor() 
	{
		return color;
	}

	@Override
	public void setColor(Color color) 
	{
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", brand=" + brand + "]";
	}
}
