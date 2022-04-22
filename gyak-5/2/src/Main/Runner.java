package Main;

import java.util.Random;
import java.util.Scanner;

public class Runner
{

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
			Teglalap[] rectangles = new Teglalap[10];
			Random rand = new Random();
			Teglalap min = new Teglalap();
			min.setOldal(10, 10);
			int a, b, k=0;

			for (int i = 0; i < 10; i++)
			{
				rectangles[i] = new Teglalap();
				rectangles[i].setOldal(rand.nextInt(2, 11), rand.nextInt(2, 11));
				System.out.println(rectangles[i].toString());
				if (rectangles[i].Terulet() < min.Terulet()) min = rectangles[i];
			}

			System.out.println("\nA legkisebb: " + min.toString() + "\n");

			System.out.print("Adj meg az A oldalt: ");
			a = Integer.parseInt(sc.nextLine().toString());
			System.out.print("Adj meg az B oldalt: ");
			b = Integer.parseInt(sc.nextLine().toString());
			Teglalap own = new Teglalap();
			own.setOldal(a, b);

			for (Teglalap rectangle : rectangles)
			{
				if (rectangle.Terulet() > own.Terulet()) k++;
			}

			System.out.println("\nA saját téglalapnál nagyobbak száma: " + k + "\n");

			boolean was = true;
			for (int i = 0; i < 10; i++)
			{
				if (rectangles[i].getAol() == own.getAol() && rectangles[i].getBol() == own.getBol())
				{
					System.out.println("Megegyező indexe: " + i+1);
					was = false;
					break;
				}
			}

			if (was) System.out.println("Nem volt megegyező!");
	}

}
