package myPackage;

public class Runner 
{

	public static void main(String[] args) 
	{
		int countrit = 0;
		Employee temp;
		Employee[] emps = 
		{
				new Employee("József", 45, 95000),
				new Employee("Rita", 64, 250000),
				new Employee("Ákos", 24)
		};
		
		for (int i = 0; i < emps.length; i++)
		{
			System.out.println(emps[i].toString());
		}		
		Employee.changeRetirBorder(70);
		for (int i = 0; i < emps.length; i++)
		{
			System.out.println(emps[i].toString());
			countrit += emps[i].countToRetirement();
		}
		countrit = (int)(countrit/emps.length);
		System.out.println("\n\n");
		
		for (int i = 0; i < emps.length; i++)
		{
			if (emps[i].countToRetirement() < 5) System.out.println(emps[i].toString());
		}
		for (int i = 0; i < emps.length; i++)
		{
			if (emps[i].countToRetirement() > countrit) System.out.println(emps[i].toString());
		}
		System.out.println("\n\n");
		
		for (int i = 0; i < emps.length; i++)
		{
			for (int k = i; k < emps.length; k++)
			{
				if (emps[i].countToRetirement() < emps[k].countToRetirement())
				{
					temp = emps[i];
					emps[i] = emps[k];
					emps[k] = temp;
				}
			}
			System.out.println(emps[i].toString());
		}
		for (int i = 0; i < emps.length; i++)
		{
			for (int k = i; k < emps.length; k++)
			{
				if (emps[i].countToRetirement() > emps[k].countToRetirement())
				{
					temp = emps[i];
					emps[i] = emps[k];
					emps[k] = temp;
				}
			}
			System.out.println(emps[i].toString());
		}
		
	}

}
