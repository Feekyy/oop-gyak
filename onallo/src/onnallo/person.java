package onnallo;

public class person
{
  private String name;
  private double mgssg;
  private int suly;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getMgssg() {
    return mgssg;
  }

  public void setMgssg(double mgssg)
  {
    this.mgssg = mgssg;
  }

  public int getSuly()
  {
    return suly;
  }

  public void setSuly(int suly)
  {
    this.suly = suly;
  }

  public double tti()
  {
    return (double)suly/(mgssg*mgssg);
  }

  public String alak()
  {
    if (tti() < 18.5) return "Sovány";
    if (tti() > 25)return "Túlsúlyos";
    return "Normál";

  }

  public String osszefuz()
  {
    return name + ", " + suly + " kg, " + mgssg + " m, " + tti() + ": " + alak();
  }
}
