package piore;

public class task1 
{

	static int N = 20;
	
	public static void main(String[] args) 
	{
		double[] leib = leibnitz();
		double[] wallis = wallis();
		double euler = euler();
		System.out.println(euler);
		printDifferenceFrom(leib, wallis);
	}

	static double[] leibnitz()
	{
		double[] nums = new double[N];
		double current = 1;
		for (int i = 0; i < N; i++)
		{
			double addendum = 1 / (double)(3 + i * 2);
			if (i%2 == 0)
			{
				addendum *= -1;
			}
			current += addendum;
			nums[i] = current * 4;
		}
		return nums; 
	}
	
	static double[] wallis()
	{
		double[] nums = new double[N];
		double current = 1;
		double divisor = 1, multiplier = 2;
		for (int i = 0; i < N; i ++)
		{
			current *= multiplier / divisor;
			if (i%2==0)
			{
				divisor += 2;
			}
			else
			{
				multiplier += 2;
			}
			nums[i] = current * 2;
		}
		return nums;
	}
	
	static void printDifferenceFrom(double[] leib, double[] wal)
	{
		double Lsum = 0;
		double Wsum = 0;
		for (int i = 0; i < N; i++)
		{
			Lsum += leib[i];
			Wsum += wal[i];
		}
		String closer = (Math.PI - Lsum) > (Math.PI - Wsum) ? "wallis" : "leibnitz";
		System.out.println(closer);
	}
	
	static double euler()
	{
		double szam = 1;
		for (int i = 1; i < N; i++)
		{
			szam += 1/fackt(i);
		}
		return szam;
	}
	
	static double fackt(int szam)
	{
		double ki = 1;
		for	(int i = 1; i <= szam; i++)
		{
			ki *= i;
		}
		return (double)ki;
	}
}

