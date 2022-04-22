package mypersons.Employee;

import mypersons.Adult;

public class Employee extends Adult 
{
	private int money;
	static int retirementBroder = 65;
	
	public Employee(String name, int age, String workplace, int money) 
	{
		super(name, age, workplace);
		this.money = money;
		
	}
	
	public int getMoney() {
		return money;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " - " + money;
	}
}
