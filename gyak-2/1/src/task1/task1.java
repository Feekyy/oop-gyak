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
			System.out.print("Kérek egy számot 1 és 10 között: ");
			while (!sc.hasNextInt()) 
			{
				System.out.println("Hibás input!");
				System.out.print("Kérek egy számot 1 és 10 között: ");
				sc.nextLine();
			}		
			bot = Integer.parseInt(sc.nextLine().toString());
		}
		while (bot < 1 || bot > 10);
		
		do
		{
			System.out.print("Kérek egy számot, ami nagyobb, mint " + bot + ": ");
			while (!sc.hasNextInt())
			{
				System.out.println("Hibás input!");
				System.out.print("Kérek egy számot 1 és 10 között: ");
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
				if (osztok1 == 0 && osztok2 == 0) System.out.println("A(z) " + i + " és a(z)" + k + " relatív prímek!");
			}
		}
		sc.close();
	}

}
