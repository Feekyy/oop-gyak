package myPackage;

public class Employee 
{
	String name;
	int age;
	int price;
	static int retirBorder = 65;
	
	public static void changeRetirBorder(int numb)
	{
		retirBorder = numb;
	}
	
	public static Employee wichIsOlder(Employee emp1, Employee emp2)
	{
		if (emp1.countToRetirement() > emp2.countToRetirement()) return emp1;
		else return emp2;
	}
	
	public int countToRetirement()
	{
		return Employee.retirBorder - this.age;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", age=" + age + ", price=" + price + ", countToRetirement()="
				+ countToRetirement() + "]";
	}

	public Employee(String name, int age, int price) 
	{
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public Employee(String name, int age) 
	{
		this.name = name;
		this.age = age;
		this.price = 10000*age;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}
}
