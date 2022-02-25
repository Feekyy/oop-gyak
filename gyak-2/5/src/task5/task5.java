package task5;

import java.util.Scanner;
public class task5 
{

	static Scanner sc = new Scanner(System.in);
	static int N = 5;

	public static void main(String[] args)
	{
			String[][] matrix = new String[N][3];
			String email;
			int asd1;

			for (int i = 0; i < N; i++)
			{
					System.out.print("Adj meg egy nevet: ");
					while (sc.hasNextInt())
					{
						System.out.println("Hibás inpup!");
						System.out.print("Adj meg egy nevet: ");
						sc.nextLine();
					}
					String nev = sc.nextLine().toString();
					matrix[i][0] = nev;

					do
					{
						System.out.print("Adja meg, hogy hány email címe van (0 és 3 között): ");
						while (!sc.hasNextInt())
						{
							System.out.println("Hibás input!");
							System.out.print("Adja meg, hogy hány email címe van (0 és 3 között): ");
							sc.nextLine();
						}
						asd1 = Integer.parseInt(sc.nextLine().toString());
					} while (asd1 > 3 || asd1 < 0);

					if (asd1 != 0)
					{
						for (int k = 1; k <= asd1; k++)
						{
							System.out.print("Adj meg egy email címet: ");
							email = sc.nextLine().toString();
							matrix[i][k] = email;
						}
					}
			}

	}

}