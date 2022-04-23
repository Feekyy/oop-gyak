package main;

public class Point 
{
	public static int x;
	public static int y;
	
	public Point(int x, int y) 
	{
		Point.x = x;
		Point.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
