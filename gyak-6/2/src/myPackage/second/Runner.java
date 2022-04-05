package myPackage.second;

import myPackage.first.Number;

public class Runner
{

	public static void main(String[] args)
	{
		final double rand = Math.random();
		double random;
		int i = 0;
		Number numb = new Number();
		numb.setX(rand);
		System.out.println(numb.getX());
		numb.setX(Math.random());
		System.out.println(numb.getX());
		while (true)
		{
			i++;
			random = Math.random();
			if (numb.isIn(random))
			{
				System.out.println(i + "st");
				break;
			}
		}
	}
}
