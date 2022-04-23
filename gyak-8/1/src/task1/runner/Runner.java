package task1.runner;

import task1.Cylinder;
import task1.Rectangle;

public class Runner {

	public static void main(String[] args) 
	{
		Cylinder cylinder = new Cylinder(10, 2);
		Rectangle rectangle = new Rectangle(2, 2, 10);
		System.out.println(cylinder.toString() + "\n" + rectangle.toString());
		if (rectangle.CompareVolume(cylinder)) System.out.println("A téglatest a nagyobb!");
		else System.out.println("A henger a nagyobb!");
	}

}
