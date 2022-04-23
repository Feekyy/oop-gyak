package main;

import java.awt.Color;

public class ColoredPoint extends Point implements Colorable
{
	@Override
	public String toString() 
	{
		return "ColoredPoint [color=" + color + " x= " + Point.x + " y= " + Point.y +"]";
	}

	private Color color;
	
	public ColoredPoint(int x, int y, Color color)
	{
		super(x, x);
		this.color = color;
	}
	
	public ColoredPoint()
	{
		this(0, 0, Colorable.defaultColor);
	}
	
	public ColoredPoint(Color color)
	{
		this(0, 0, color);
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
}
