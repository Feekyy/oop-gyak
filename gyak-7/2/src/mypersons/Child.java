package mypersons;

public class Child extends Person 
{
	
	private String school;
	
	public Child(String name, int age, String school) 
	{
		super(name, age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	@Override
	public String toString()
	{
		return super.toString() + " - " + school;
	}

}
