package mypersons;

public class Person 
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return name + " - " + age;
	}
	
	public boolean ifYounger(Person person)
	{
		if (person.getAge() < this.getAge()) return true;
		else return false;
	}
}
