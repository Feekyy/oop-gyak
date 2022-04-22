package 3;

import java.util.Scanner;

public class Runner
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Adjon meg egy számot: ");
		int N = Integer.parseInt(sc.nextLine());
		Hanglemez[] lemezek = new Hanglemez[N];
		for (int i = 0; i < lemezek.length; i++)
		{
			lemezek[i] = new Hanglemez();
			System.out.print("Kérek egy előadót: ");
			lemezek[i].setEloado(sc.nextLine());
			System.out.print("Kérek egy címet: ");
			lemezek[i].setCim(sc.nextLine());
			System.out.print("Kérek egy hosszat: ");
			lemezek[i].setHossz(Integer.parseInt(sc.nextLine()));
			System.out.println(lemezek[i].toString());
		}

		int max = lemezek[0].getHossz();
		String adatok = lemezek[0].toString();
		for (int i = 1; i < lemezek.length; i++)
		{
			if (max < lemezek[i].getHossz())
			{
			max = lemezek[i].getHossz();
			adatok = lemezek[i].toString();
			}
		}
		System.out.println("A tömb leghosszabb száma a(z) " + adatok);

		System.out.print("Adjon meg egy előadót: ");
		String eloado = sc.nextLine();
		System.out.println("A bekért előadó lemezei: ");
		for (int i = 0; i < lemezek.length; i++)
		{
			if (lemezek[i].Equal(eloado)) System.out.println(lemezek[i].toString());
		}
	}
}
