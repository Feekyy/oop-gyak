		package task1;
import java.util.Scanner;

public class task1 
{
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int bot = 0, top = 0, osztok1 = 0, osztok2 = 0;
		
		do
		{
			System.out.print("K�rek egy sz�mot 1 �s 10 k�z�tt: ");
			while (!sc.hasNextInt()) 
			{
				System.out.println("Hib�s input!");
				System.out.print("K�rek egy sz�mot 1 �s 10 k�z�tt: ");
				sc.nextLine();
			}		
			bot = Integer.parseInt(sc.nextLine().toString());
		}
		while (bot < 1 || bot > 10);
		
		do
		{
			System.out.print("K�rek egy sz�mot, ami nagyobb, mint " + bot + ": ");
			while (!sc.hasNextInt())
			{
				System.out.println("Hib�s input!");
				System.out.print("K�rek egy sz�mot 1 �s 10 k�z�tt: ");
				sc.nextLine();
			}
			top = Integer.parseInt(sc.nextLine().toString());
		}
		while (top < bot);
		for (int i = bot; i <= top; i++)
		{
			for (int k = bot; k <= top; k++)
			{
				if (i == k) continue;
				osztok1 = 0;
				osztok2 = 0;
				for (int j = 2; j < i; j++)
				{
					if (i % j == 0) osztok1++;
					if (k % j == 0) osztok2++;
					
				}
				if (osztok1 == 0 && osztok2 == 0) System.out.println("A(z) " + i + " �s a(z)" + k + " relat�v pr�mek!");
			}
		}
		sc.close();
	}

}
