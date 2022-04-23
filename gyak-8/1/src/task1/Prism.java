package task1;

public abstract class Prism
{
  int height;

  public Prism(int height)
  {
	this.height = height;
  }

  public int getHeight()
  {
	return height;
  }

  public double Volume()
  {
    return baseArea()*height;
  }

  public boolean CompareVolume(Prism prism)
  {
    if (Volume() > prism.Volume()) return true;
    else return false;
  }

  public abstract double baseArea();
}
