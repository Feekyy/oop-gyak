package task3;

import java.util.Scanner;

public class task3 
{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int a = 0, b = 0, c = 0;
		double rdmny = 0, real = 0, imag = 0;
		System.out.print("Add meg az A számat: ");
		while (!sc.hasNextInt())
		{
			System.out.println("Hibás input!");
			System.out.print("Add meg az A számat: ");
			sc.nextLine();
		}
		a = Integer.parseInt(sc.nextLine().toString());
		
		System.out.print("Add meg az B számat: ");
		while (!sc.hasNextInt())
		{
			System.out.println("Hibás input!");
			System.out.print("Add meg a B számat: ");
			sc.nextLine();
		}
		b = Integer.parseInt(sc.nextLine().toString());
		
		System.out.print("Add meg az C számat: ");
		while (!sc.hasNextInt())
		{
			System.out.println("Hibás input!");
			System.out.print("Add meg a C számat: ");
			sc.nextLine();
		}
		c = Integer.parseInt(sc.nextLine().toString());
		
		if (0 < (Math.pow(b, 2)-4*a*c))
		{
			rdmny = (-1*b+(Math.sqrt(b^2-4*a*c)))/(2*a);
			System.out.println("1. gyök: " + rdmny);
			rdmny = (-1*b-(Math.sqrt(b^2-4*a*c)))/(2*a);
			System.out.println("2. gyök: " + rdmny);
		}
		if (0 == (Math.pow(b, 2)-4*a*c))
		{
			rdmny = (-1*b)/(2*a);
			System.out.println("Az egyetlen gyök: " + rdmny);
		}
		if (0 > (Math.pow(b, 2)-4*a*c))
		{
			real = ((-1*b)/(2*a));
			imag = (Math.sqrt((b^2-4*a*c)*-1))/(2*a);
			System.out.println("1. gyök: " + real + " + " + imag + "i\n2. gyök: " + real + " - " + imag + "i");
		}
	}

}
