package task2;

import java.util.Scanner;

public class task2 
{
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int szam;
		do
		{
			System.out.print("Adj meg egy 0-n�l nagyobb sz�mot: ");
			while (!sc.hasNextInt())
			{
				System.out.println("Hib�s input!");
				System.out.print("Adj meg egy 0-n�l nagyobb sz�mot: ");
				sc.nextLine();
			}
			szam = Integer.parseInt(sc.nextLine().toString());
		}
		while (szam < 0);
		
		for (int i = 1; i <= szam; i++)
		{
			for (int k = 0; k < i; k++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
