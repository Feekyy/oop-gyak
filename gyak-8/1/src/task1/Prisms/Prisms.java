package task1.Prisms;

import task1.Cylinder;
import task1.Prism;

public class Prisms 
{
	Prism[] prisms;

	public Prisms(int N) 
	{
		this.prisms = new Prism[N];
	}
	
	public void setPrism(int i, Prism prism)
	{
		this.prisms[i] = prism;
	}
	
	public int getSize()
	{
		return this.prisms.length;
	}
	
	public Prism getElement(int i)
	{
		return this.prisms[i];
	}
	
	public int getNotNulls()
	{
		int k = 0;
		for (Prism prism : prisms)
		{
			if (prism != null) k++;
		}
		return k;
	}
	
	public double getAvargeVolume()
	{
		double volume = 0;
		for (Prism prism : prisms)
		{
			if (prism != null) volume += prism.Volume();
		}
		return (volume/getNotNulls());
	}
	
	public int getCylinders()
	{
		int k = 0;
		for (Prism prism : prisms)
		{
			if (prism instanceof Cylinder) k++;
		}
		return k;
	}
}
