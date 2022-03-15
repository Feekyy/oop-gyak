package szinozon;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {

	static Scanner sc = new Scanner(System.in);
	static Scanner code = new Scanner(System.in);
	static Scanner outsc = new Scanner(System.in);

	public static void main(String[] args)
	{
		String difficult = "", write, good = "", outstr = "";
		int length = 0, rand;
		Random random = new Random();
		boolean out, okay;
		
		do
		{
			out = true;
			do
			{
				System.out.print("Please select a difficult! (Easy/Medium/Hard): ");
				while (sc.hasNextInt())
				{
					System.out.println("*Cannot interpret the input*");
					System.out.print("Please select a difficult! (Easy/Medium/Hard): ");
					sc.nextLine();
				}

				difficult = sc.nextLine().toString().toLowerCase();
			} 
			while (difficult == "easy" || difficult == "medium" || difficult == "hard");

			if (difficult.equals("easy")) length = 4;
			if (difficult.equals("medium")) length = 6;
			if (difficult.equals("hard")) length = 8;

			List<String> codeColors = new ArrayList<String>();
			List<String> tipColors = new ArrayList<String>();
			List<String> was = new ArrayList<String>();
			String[] inputChars = new String[length];
		
			for (int i = 0; i < length; i++)
			{
				rand = random.nextInt(7);
				codeColors.add(ColorsFromNumbers(rand));
				good += "X ";
			}
			System.out.println("*Code generated*");
		
			for (int h = 1; h < 11; h++)
			{
				do
				{
					okay = false;
					System.out.print("Give me a tip: ");
					inputChars = code.nextLine().toString().split(" ");
					if (inputChars.length != length)
					{
						okay = true;
						System.out.println("*Cannot interpret the input*");
					}
					else
					{
						for (int i = 0; i < length; i++)
						{
							tipColors.add(ColorsFromChars(inputChars[i]));
						}
						if (tipColors.contains(null))
						{
							okay = true;
							System.out.println("*Cannot interpret the input*");
						}
					}
		
				} 
				while (okay);
				System.out.println("*Tip processed*");
				
				write = "";
				for (int i = 0; i < length; i++)
				{
					if (codeColors.get(i) == tipColors.get(i))
					{
						write += "X ";
						tipColors.set(i, null);
					}
				}		
				for (int i = 0; i < length; i++)
				{
					if (tipColors.contains(codeColors.get(i)) && tipColors.get(i) != null)
					{
						write += "| ";
					}
				}	
		
				if (write.equals(good))
				{
					System.out.println("You find the code. You win!");
					out = false;
					break;
				}
				else System.out.println("Your " + h + "st tip's result: " + write);
				tipColors.clear();
			}
			
			if (out)
			{
				System.out.println("You cannot find the code. I win!\nCode: " + codeColors);
			}
			codeColors.clear();
			
			do
			{
				System.out.print("Do you want play another game? (Yes/No): ");
				while (outsc.hasNextInt())
				{
					System.out.println("*Cannot interpret the input*");
					System.out.print("Do you want play another game? (Yes/No): ");
					sc.nextLine();
				}
				outstr = outsc.nextLine().toLowerCase();
			} 
			while (outstr == "yes" || outstr == "no");
			
			if (outstr.equals("no"))
			{
				out = false;
			}
		}
		while (out);
		System.out.println("Thanks for playing!");
	}

	public static String ColorsFromNumbers(int numb)
	{
		if (numb == 0) return "black";
		if (numb == 1) return "white";
		if (numb == 2) return "green";
		if (numb == 3) return "light blue";
		if (numb == 4) return "red";
		if (numb == 5) return "pink";
		if (numb == 6) return "orange";
		if (numb == 7) return "yellow";
		return null;
	}
	public static String ColorsFromChars(String chars)
	{
		if (chars.equals("b")) return "black";
		if (chars.equals("o")) return "orange";
		if (chars.equals("g")) return "green";
		if (chars.equals("l")) return "light blue";
		if (chars.equals("r")) return "red";
		if (chars.equals("p")) return "pink";
		if (chars.equals("w")) return "white";
		if (chars.equals("y")) return "yellow";
		return null;
	}

}
