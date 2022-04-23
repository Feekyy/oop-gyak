package task1;

public class Cylinder extends Prism
{
	double beam;

	public Cylinder(int height, double beam) 
	{
		super(height);
		this.beam = beam;
	}

	@Override
	public double baseArea() 
	{	
		return (Math.pow(beam, 2)*Math.PI);
	}

	@Override
	public String toString() 
	{
		return "Cylinder [beam=" + beam + ", height=" + height + ", baseArea()=" + baseArea() + ", Volume()=" + Volume() + "]";
	}
	
	
	
}
