package methods.com;

public class methods12 {
	
	
	 int i =100;
	public  void m1()
	{
		System.out.println("hiiiiii");
	}
}
class methods123
{
	public void m2()// Access static var and static method
	{
		methods12 m4 = new methods12();
		System.out.println("janaedha naidus");
		System.out.println(m4.i);
		m4.m1();
	}
}