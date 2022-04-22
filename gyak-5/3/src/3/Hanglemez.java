package 3;

public class Hanglemez
{
	private String eloado;
	private String cim;
	private int hossz;

	public String getEloado()
	{
		return eloado;
	}
	public void setEloado(String eloado)
	{
		this.eloado = eloado;
	}
	public String getCim()
	{
		return cim;
	}
	public void setCim(String cim)
	{
		this.cim = cim;
	}
	public int getHossz()
	{
		return hossz;
	}
	public void setHossz(int hossz)
	{
		this.hossz = hossz;
	}
	@Override
	public String toString()
	{
		return eloado + ": " + cim + ", " + hossz + " perc";
	}

	public int whichLonger(int hossz1, int hossz2)
	{
		if (hossz1 == hossz2) return 0;
		else if (hossz1 > hossz2) return 1;
		else return -1;
	}

	public boolean Equal(String in)
	{
		if (eloado.equals(in)) return true;
		else return false;
	}
}
