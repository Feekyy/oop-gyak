package szinozon;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main
{

	static boolean succes;
	static String solution = "X X X X ";
	static String result;
	static List<String> codeColors = new ArrayList<>();
	static List<String> tippColors = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int chances;

	public static void main(String[] args)
	{
		
		String out = "";
		
		do
		{
		chances = 0;
		codeGeneration();
		succes = true;
			do
			{
				userCodeInput();
				tippResult();
				resultProcessing();
				chances++;
			}
			while (succes);
			System.out.print("Do you wanna play another game? (yes/no): ");
			try
			{
				out = sc.nextLine().toString().toLowerCase();
			}
			catch(Exception e)
			{
				System.out.println("Wrond input!");
			}
		} while (out.equals("yes"));
		System.out.println("Thanks for this little game! Goodbye!");

		sc.close();
	}

	public static void codeGeneration()
	{
		Random random = new Random();
		codeColors.clear();
		System.out.println("*Code generated*");
		for (int i = 0; i < 4; i++)
		{
			int rand = random.nextInt(7);
			codeColors.add(ColorSwitch(rand));
		}
	}

	public static String ColorSwitch(int numb)
	{
		String[] colors = {"white", "green", "light blue", "red", "pink", "yellow", "orange", "black"};
		try
		{
			return colors[numb];
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public static void userCodeInput()
	{
		System.out.println("Tipp example: \"1 2 3 4\"");
		boolean out;
		int error;
		do
		{
			out = true;
			String[] scanner = {null, null, null, null};
			tippColors.clear();
			System.out.print("Give me a tipp: ");
			try
			{
				scanner = sc.nextLine().toString().split(" ");
				for (int i = 0; i < scanner.length; i++)
				{
					tippColors.add(ColorSwitch(Integer.parseInt(scanner[i])));
				}
				if (tippColors.size() != 4 || tippColors.contains(null)) error = 100/0;
				else out = false;
			}
			catch(Exception e)
			{
				System.out.println("Wrong input!");
			}
		} while(out);
	}

	public static void tippResult()
	{
		System.out.println("*Processing the tipp*");

		result = "";
		List<String> goodColors = new ArrayList<>();
		
		for (int i = 0; i < 4; i++)
		{
			goodColors.add(codeColors.get(i));
			if (tippColors.get(i) == goodColors.get(i))
			{
				result += "X ";
				goodColors.set(i, null);
			}
		}
		
		for (int i = 0; i < 4; i++)
		{
			for (int k = i+1; k < 4; k++)
			{
				if (tippColors.get(i) == goodColors.get(k))
				{
					result += "| ";
					goodColors.set(i, null);
				}
			}
		}
	}

	public static void resultProcessing()
	{
		if (result.equals(solution))
		{
			succes = false;
			System.out.println("You found the code. You win!");
		}
		else if (chances != 10)
			{
				System.out.println("Your " + chances + "th tipp's result: " + result);
			}
			else
			{
				succes = false;
				System.out.println("You didn't find the code! I win!\nThe code was: " + codeColors);
			}
	}


}
