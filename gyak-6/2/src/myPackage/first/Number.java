package myPackage.first;

public class Number
{
	private double x;
	static double y = 0.001;

	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x = x;
	}

	public boolean isIn(double n)
	{
		if (Math.abs(getX() - n) < y)
		{
			return true;
		}
		else return false;
	}
}