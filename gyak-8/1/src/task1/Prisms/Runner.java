package task1.Prisms;

import java.util.Random;
import task1.Cylinder;
import task1.Rectangle;

public class Runner {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		Prisms prisms = new Prisms(5);
		
		for (int i = 0; i < 5; i++)
		{
			if (rand.nextInt(1, 4) != 1)
			{
				if (rand.nextInt(0, 2) == 1)
				{
				Cylinder prism = new Cylinder(rand.nextInt(1, 5), rand.nextInt(1, 11));
				prisms.setPrism(i, prism);
				}
				else
				{
					Rectangle prism = new Rectangle(rand.nextInt(1, 5), rand.nextInt(1, 5), rand.nextInt(1, 11));
					prisms.setPrism(i, prism);
				}
			}
			else prisms.setPrism(i, null);
			if (prisms.getElement(i) != null) System.out.println(prisms.getElement(i).toString());
			else System.out.println("null");
		}
		System.out.println(prisms.getAvargeVolume() + "\n" + prisms.getCylinders());
	}

}
