package Main;

public class Teglalap
{
	private int Aol;
	private int Bol;

	public int getAol()
	{
		return Aol;
	}
	public int getBol()
	{
		return Bol;
	}
	public void setOldal(int Aol, int Bol)
	{
		this.Aol = Aol;
		this.Bol = Bol;
	}
	public void setOldal(int Aol)
	{
		this.Aol = Aol;
		this.Bol = Aol;
	}

	public int Terulet()
	{
		return Aol*Bol;
	}

	@Override
	public String toString()
	{
		return Aol + "_oldal, " + Bol + "_oldal: " + Terulet();
	}

	public Boolean Biggest(int A, int B)
	{
		if (A*B > Terulet()) return false;
		else return true;
	}
	public Boolean Biggest(int A)
	{
		if (A == Aol) return true;
		else return false;
	}

	public Boolean Equal(int A, int B)
	{
		if (A == Aol && B == Bol) return true;
		else return false;
	}

	public Boolean Equal(int A)
	{
		if (Terulet() == Math.pow(A, 2)) return true;
		else return false;
	}


}
