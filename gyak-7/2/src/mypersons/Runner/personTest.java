package mypersons.Runner;

import mypersons.Child;
import mypersons.Adult;
import mypersons.Person;
import mypersons.Employee.Employee;

import java.util.Scanner;

public class personTest
{

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		Person personA = Inputs("Lajos", 42, "World Trade Center", "ISIS menekült tábor", 400);
		Person personB = Inputs("Jancsika", 14, "World Trade Center", "ISIS menekült tábor", 500);

		if (personA instanceof Adult) System.out.println("Adult: " + personA.toString());
		else System.out.println("Kid: " + personA.toString());
		if (personB instanceof Adult) System.out.println("Adult: " + personB.toString());
		else System.out.println("Kid: " + personB.toString());

		int n, age, money;
		String name, workplace, school;
		do
		{
			System.out.print("Adj meg egy tömb méretet: ");
			while (sc.hasNextInt())
			{
				System.out.println("Hibás input!" + "\nAdj meg egy tömb méretet: ");
				sc.nextLine();
			}
			n = Integer.parseInt(sc.nextLine().toString());
		}
		while (n < 0);

		Person[] persons = new Person[n];
		for (int i = 0; i < n; i++)
		{
			System.out.print("Name: ");
			name = sc.nextLine().toString();
			System.out.print("Age: ");
			age = Integer.parseInt(sc.nextLine().toString());
			System.out.print("Workplace: ");
			workplace = sc.nextLine().toString();
			System.out.print("School: ");
			school = sc.nextLine().toString();
			System.out.print("Money: ");
			money = Integer.parseInt(sc.nextLine().toString());
			persons[i] = Inputs(name, age, workplace, school, money);
		}

		for (int i = 0; i < n; i++)
		{
			for (int k = i; k < n; k++)
			{
				if (persons[i].getAge() < persons[k].getAge())
				{
					Person temp = persons[k];
					persons[i] = persons[k];
					persons[k] = temp;
				}
			}
		}
	}

	public static Person Inputs(String name, int age, String workplace, String school, int money)
	{
		Person person;
		if (age < 18)
		{
			person = new Child(name, age, school);
		}
		else if (!workplace.isEmpty()) person = new Employee(name, age, workplace, money);
				else person = new Adult(name, age, workplace);
		return person;
	}

}
