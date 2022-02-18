package task2;

public class task2 
{
	
	static int N = 100;

	public static void main(String[] args) 
	{
		int mennyi = 0;
		for (int i = 1; i <= 100; i++)
		{
			for (int k = i-1; k > i-3; k--)
			{
				if (isPrime(i) && isPrime(k))
				{
					if (Math.abs(k-i) == 2)
					{
					mennyi++;
					System.out.println("A(z)" + i + " és a(z) " + k + "ikerprímek!");
					}
				}
			}
		}
		System.out.println("Összesen " + mennyi + " ikerprím van " + N + "-ig!");
			
	}
	
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
