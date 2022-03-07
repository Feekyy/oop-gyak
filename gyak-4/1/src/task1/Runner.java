package task1;

import java.util.Scanner;

public class Runner

{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
			Employee emp = new Employee();
			Employee emp2 = new Employee();
			emp.setName("Kovács Józsi");
			emp.setSalary(100);
			emp2.setName("Shrek");
			emp2.setSalary(500);
			System.out.println(emp.toString());
			emp.raiseSalary(50);
			System.out.println(emp.toString());
			System.out.println(emp2.toString());

			System.out.println("Is within: " + emp.isWithinBounderies(10, 200));
			System.out.println("Is within: " + emp2.isWithinBounderies(10, 200));
			System.out.println("Tax: " + emp.getTax());
			System.out.println("Has greater: " + emp.hasHigherSalaryThan(emp2));

			Employee[] emps = new Employee[2];
			for (int i = 0; i < emps.length; i++) emps[i] = new Employee();
			for (int i = 0; i < emps.length; i++)
			{
				readEmployee(emps[i]);
			}
			printArray(emps);
			int maxI = getHighestSalaryIndex(emps);
			System.out.println("Highest salary: " + emps[maxI].toString());
			System.out.println("Within boundaries: " + countEmpsWithSalaryInInterval(emps, 10, 200));
			System.out.println("Avg salary: " + calcAvgSalary(emps));
			System.out.println("Tax sum: " + calcTaxSum(emps));
			sc.close();
	}

static void readEmployee(Employee emp)
	{
		String name = sc.nextLine();
		int salary = Integer.parseInt(sc.nextLine());
		emp.setName(name);
		emp.setSalary(salary);
	}

static void printArray(Employee[] emps)
	{
		for (Employee emp : emps)
		{
			System.out.println(emp.toString());
		}
	}

static int getHighestSalaryIndex(Employee[] emps)
	{
		int maxI = 0;
		for (int i = 1; i < emps.length; i++)
		{
			if (emps[i].hasHigherSalaryThan(emps[maxI]))
			{
				maxI = i;
			}
		}
		return maxI;
}

static int countEmpsWithSalaryInInterval(Employee[] emps, int lower, int upper)
	{
		int count = 0;
		for (Employee emp : emps)
		{
			if (emp.isWithinBounderies(lower, upper)) count++;
		}
		return count;
}

static int calcAvgSalary(Employee[] emps)
	{
		int sum = 0;
		for (Employee emp : emps)
		{
			sum += emp.getSalary();
		}
		return sum/emps.length;
}

static int calcTaxSum(Employee[] emps)
	{
		int taxSum = 0;
		for (Employee emp : emps)
		{
			taxSum += emp.getTax();
		}
		return taxSum;
	}
}
