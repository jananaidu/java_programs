package oops_concept;

public class this_keyword {

	 String s = " jana ";
	static String s1 = " i love u ";
	
	public static void m1()
	{
		System.out.println("byeeee");
		System.out.println(s1);
		
		System.out.println(new this_keyword().s);
	}
	public void m2()
	{
		System.out.println(" hello world");
		this.m3();
		System.out.println(s1);
	}
	public void m3()
	{
		System.out.println(" welcom my world");
		m1();
		System.out.println(this.s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_keyword th = new this_keyword();
		System.out.println(s1);
		th.m2();
//		m1();
	}

}
