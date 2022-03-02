package task2;

import java.util.Arrays;

public class task2
{

	static int N = 10;

	public static void main(String[] args)
	{
			int[] szamok1 = new int[N];
			double[] szamok2 = new double[N];
			//char[] szamok3 = new char[N];
			szamok1 = feltoltint(szamok1);
			szamok2 = feltoltdoub(szamok2);
			//szamok3 = feltoltchar(szamok3);

			//a
			System.out.println("Int tömb elemei:");
			for (int szam : szamok1) System.out.println(szam);
			System.out.println("\nDouble tömb elemei:");
			for (double szam : szamok2) System.out.println(szam);
			/*System.out.println("\nChar tömb elemei:");
			for (char szam : szamok3) System.out.println(szam);*/
			
			//b
			Arrays.sort(szamok1);
			Arrays.sort(szamok2);
			System.out.println("\nAz int tömb legnagyobb eleme: " + (szamok1[N-1]) + "\nA double tömb legnagyobb eleme: " + (szamok2[N-1]));
			
			//c
			int szml1 = 0;
			for (int szam : szamok1)
			{
				if (Math.sqrt(szam) % 1 == 0 && szam != 1)
				{
					szml1++;
				}
			}
			
			int szml2 = 0;
			for (double szam : szamok2)
			{
				if (Math.sqrt(szam) % 1 == 0 && szam != 1)
				{
					szml2++;
				}
			}
			System.out.println("\nAz int tömb négyzetszámainak száma: " + szml1 + "\nA double tömb négyzetszámainak száma: " + szml2);
			
			//d
			double tlg1 = 1, tlg2 = 1;
			for (int szam : szamok1) tlg1 *= (double)szam;
			tlg1 = Math.pow(tlg1, 1.0/(double)N);
			for (double szam : szamok2) tlg2 *= szam;
			tlg2 = Math.pow(tlg2, 1.0/(double)N);
			System.out.println("\nAz int tömb mértani átalga: " + tlg1 + "\nA double tömb mértani átlaga: " + tlg2);
			
	}

	static int[] feltoltint(int[] tomb)
	{
		double rand;
		for (int i = 0; i < N; i++)
		{
				tomb[i] = (int)(rand = Math.random() * 50) + 1;
		}
		return tomb;
	}

	static double[] feltoltdoub(double[] tomb)
	{
		double rand;
		for (int i = 0; i < N; i++)
		{
				rand = (rand = Math.random() * 50) + 1;
				rand *= 100;
				rand = Math.round(rand);
				tomb[i] = rand/100;
		}
		return tomb;
	}

/*	static char[] feltoltchar(char[] tomb)
	{
		double rand;
		for (int i = 0; i < N; i++)
		{
				rand = ((rand = Math.random() * 50) + 1);
				String at = Double.toString(rand);
				tomb[i] = at.charAt(0);
				for (int k = 1; k < at.length(); k++)
				{
					tomb[i] += at.charAt(k);
				}
		}
		return tomb;
	} */
}
