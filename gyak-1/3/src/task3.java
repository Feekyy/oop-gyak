import java.util.Random;

public class task3
{
	
	static int N = 10;
	
	public static void main(String[] args) 
	{
		int[] tomb1 = new int[N];
		tomb1 = feltolt(tomb1);
		kiir(tomb1);
		forkiir(tomb1);
		paravr(tomb1);
		minker(tomb1);
		monotone(tomb1);
		tomb1 = novekvo(tomb1);
		kiir(tomb1);
	}
	
	static int[] feltolt(int tomb1[])
	{
		Random rand = new Random();
		for (int i = 0; i < N; i++)
		{
			tomb1[i] = rand.nextInt();
		}
		
		return tomb1;
	}
	
	static void kiir(int tomb1[])
	{
		for (int i = 0; i < N; i++)
		{
			System.out.print(tomb1[i] + " ");
		}
		System.out.println();
	}
	
	static void forkiir(int tomb1[])
	{
		for (int i = N-1; i >= 0; i--)
		{
			System.out.print(tomb1[i] + " ");
		}
		System.out.println();
	}
	
	static void paravr(int tomb1[])
	{
		int k = 0, osszeg = 0;
		for (int i = 0; i < N; i++)
		{
			if (tomb1[i] % 2 == 0)
			{
				osszeg += tomb1[i];
				k++;
			}
		}
		System.out.println(osszeg/k);
	}
	
	static void minker(int tomb1[])
	{
		int min = tomb1[0];
		for (int i = 0; i < N; i++)
		{
			if (tomb1[i] < min)
			{
				min = tomb1[i];
			}
		}
		System.out.println(min);
	}
	
	static void monotone(int tomb1[])
	{
		for (int i = 0; i < N-1; i++)
		{
			if (tomb1[i] >= tomb1[i+1])
			{
				System.out.println("Nem monoton!");
				return;
			}
		}
		System.out.println("Monoton!");
	}
	
	static int[] novekvo(int tomb1[])
	{
		int at = 0;
		for (int i = 0; i < N; i++)
		{
			int min = tomb1[i];
			for (int k = i; k < N; k++)
			{
				if(min > tomb1[k])
				{
					at = tomb1[k];
					tomb1[k] = tomb1[i];
					tomb1[i] = at;
				}
			}
		}
		
		return tomb1;
	}
}
