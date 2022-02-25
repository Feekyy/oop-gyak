package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		List<String> nevek = new ArrayList<>();
		int bekert;

		do
		{
			System.out.print("Adjon meg egy 1 és 10 közötti számot: ");
			while(!sc.hasNextInt())
			{
				System.out.println("Hibás input!");
				System.out.print("Adjon meg egy 1 és 10 közötti számot: ");
				sc.nextLine();
			}
			bekert = Integer.parseInt(sc.nextLine().toString());
		}
		while (bekert < 1 || bekert > 10);

		for (int i = 0; i < bekert; i++)
		{
			sc = new Scanner(System.in);
			System.out.print("Adjon meg egy nevet: ");
			while(sc.hasNextInt())
			{
				System.out.println("Hibás input!");
				System.out.print("Adjon meg egy nevet: ");
				sc.nextLine();
			}
			String nev = sc.next();
			nevek.add(nev);
		}

		// a, feladat:
		hasonlit(nevek);

		//b, feladat:
		kezdohas(nevek);
		sc.close();
	}

	static void hasonlit(List<String> nevek)
	{
		int asd1 = 0;
		for (int i = 0; i < nevek.size(); i++)
		{
			for (int k = i; k < nevek.size(); k++)
			{
				if (i == k) continue;
				if (nevek.get(i).toLowerCase().equals(nevek.get(k).toLowerCase()))  asd1++;
			}
		}
		System.out.println("Összesen " + asd1 + " db névegyezés van a tömben!");
	}

	static void kezdohas(List<String> nevek)
	{
		int asd1 = 0;
		for (int i = 0; i < nevek.size(); i++)
		{
			for (int k = i; k < nevek.size(); k++)
			{
				if (i == k) continue;
				if (nevek.get(i).charAt(0) == nevek.get(k).charAt(0)) asd1++;
			}
		}
		System.out.println("Összesen " + asd1 + " db név kezdő betűje egyezik meg!");
	}

}
