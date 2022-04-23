package Main;

import java.util.Scanner;
import java.util.Random;

public class Runner 
{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = Integer.parseInt(sc.nextLine().toString());
		Product[] products = new Product[n];
		
		for (int i = 0; i < n; i++)
		{
			if (rand.nextInt(0, 2) == 1) products[i] = new Bread(rand.nextInt(300, 500), 27, rand.nextInt(1, 20));
			else products[i] = new Book(rand.nextInt(300, 500), 5, rand.nextInt(100, 400));
		}
		
		for (int i = 0; i < n; i++)
		{
			for (int k = i; k < n; k++)
			{
				if (products[i].unitPrice() < products[k].unitPrice())
				{
					Product temp = products[k];
					products[k] = products[i];
					products[i] = temp;
				}
			}
			System.out.println(products[i].toString());
		}
			
	}

}
