package task1;

public class Rectangle extends Prism
{
	double A;
	double B;
	public Rectangle(int height, double a, double b) 
	{
		super(height);
		A = a;
		B = b;
	}
	
	@Override
	public double baseArea() {
		return A*B;
	}

	@Override
	public String toString() {
		return "Rectangle [A=" + A + ", B=" + B + ", height=" + height + ", baseArea()=" + baseArea() + ", Volume()=" + Volume() + "]";
	}
}
