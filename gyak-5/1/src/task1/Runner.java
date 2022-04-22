package task1;

public class Runner
{

	public static void main(String[] args)
	{
		Teglalap a = new Teglalap();
		a.setOldal(4, 5);
		Teglalap b = new Teglalap();
		b.setOldal(5);
		Teglalap c = new Teglalap();
		c = a;

		System.out.println(a.toString() + "\n" + b.toString() + "\n" + c.toString());
		a.setOldal(4);
		System.out.println(a.toString() + "\n" + b.toString() + "\n" + c.toString());
		a = b;
		System.out.println(a.toString() + "\n" + b.toString() + "\n" + c.toString());
		System.out.println(a.Equal(b.getAol()));
	}

}
