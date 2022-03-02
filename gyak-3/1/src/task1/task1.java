package task1;

import java.util.Scanner;

public class task1
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		String[] be = new String[3];
		int valt1 = 0, valt2 = 0;
		char muv;
		String tov = "igen";
		while (tov.equals("igen"))
		{
			System.out.print("Adj meg két számot és köztök egy műveletet: ");
			String input = sc.nextLine();
			be = input.split(" ");
			valt1 = Integer.parseInt(be[0]);
			valt2 = Integer.parseInt(be[2]);
			muv = be[1].charAt(0);
			switch (muv)
			{
			case '+':
				System.out.println(valt1+valt2);
				break;
			case '-':
				System.out.println(valt1-valt2);
				break;
			case '*':
				System.out.println(valt1*valt2);
			case '/':
				if (valt2 != 0)
				{
					System.out.println(valt1/valt2);
					break;
				}
				else System.out.println("A második változó nem lehet nulla!"); break;
			case '%':
				if (valt2 != 0)
				{
					System.out.println(valt1%valt2);
					break;
				}
				else System.out.println("A második változó nem lehet nulla!"); break;
			default:
				System.out.println("Nem tudtam értelmezni!");
				break;
			}
			System.out.print("Akarod folytatni (Igen/Nem): ");
			tov = sc.nextLine().toString().toLowerCase();
		}
	}	
}


