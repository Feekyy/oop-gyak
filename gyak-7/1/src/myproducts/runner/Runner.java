package myproducts.runner;

import myproducts.Bread;
import myproducts.Product;

public class Runner {

	public static void main(String[] args)
	{
		//a feladat
		Product product = new Product("Asztal", 10000, 27);
		Bread bread = new Bread("Kenyér", 500, 27, 5);
		System.out.println(product.toString() + "\n" + bread.toString());
		System.out.println(product.BruttoPrice() > bread.BruttoPrice() ? "Az asztal a nagyobb!" : "A kenyér a nagyobb!");

		//b feladat
		Product product2 = new Bread("Zsák", 4000, 27, 1);
		System.out.println("\n" + product2.toString());
		
		//c feladat
		Bread bread2 = new Bread("Kenyér", 400, 27, 5);
		System.out.println(Bread.CompareBreads(bread, bread2));
	}

}
