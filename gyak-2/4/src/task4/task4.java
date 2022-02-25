package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task4
{

	static Scanner sc = new Scanner(System.in);
	static int N = 4;
	static int M = 6;
	static int max = N*M*2;

    public static void main(String[] args)
    {
        int[][] matrix1 = new int[N][M];
        Random random = new Random();
        int rand = 0;
        List<Integer> marvolt = new ArrayList<Integer>();
        Boolean ok = false;
        int bekert = 0;
        //tudom inicalizálni kéne, de az érdekesség kedvéért most randommal töltöm fel!

        for (int i = 0; i < N; i++)
        {
          for (int k = 0; k < M; k++)
          {
            ok = false;
            while (!ok)
            {
              rand = random.nextInt(max);
              if (!marvolt.contains(rand))
              {
            	  marvolt.add(rand);
            	  matrix1[i][k] = rand;
            	  ok = true;
              }
            }
          }
        }
        
        //kiírás
        matrixkiir(matrix1);
        
        //bekérés
        bekert = bekeres(max);
        
        //keresés
        keres(matrix1, bekert);
    }
    
    static void matrixkiir(int[][] matrix)
    {
    	for (int i = 0; i < N; i++)
    	{
    		for (int k = 0; k < M; k++)
    		{
    			System.out.print(matrix[i][k] + " ");
    		}
    		System.out.println();
    	}
    }
    
    static int bekeres(int max)
    {
    	int be = 0;
    	do
    	{
    		System.out.print("\nAdj meg egy 0 és " + max + " közé eső számot: ");
    		while (!sc.hasNextInt())
    		{
    			System.out.println("Hibás input!");
    			System.out.print("Adj meg egy 0 és " + max + " közé eső számot: ");
    			sc.nextLine();
    		}
    		be = Integer.parseInt(sc.nextLine().toString());
    	} while ( be < 0 || be > max);
    	return be;
    }
    
    static void keres(int[][] matrix, int be)
    {
    	for (int i = 0; i < N; i++)
    	{
    		for (int k = 0; k < M; k++)
    		{
    			if (matrix[i][k] == be)
    			{
    				System.out.println("A mega dott elem a(z) " + i + k + " helyen található meg!");
    				return;
    			}
    		}
    	}
    	System.out.println("A megadott elem nincs benne a mátrixban!");
    }
}
