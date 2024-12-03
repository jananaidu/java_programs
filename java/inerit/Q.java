package inerit;

public class Q extends p{

	static int i = 123;
	public static void m1()
	{
		System.out.println(i+" "+i);
	}
	Q(int a)
	{
		this("hiii");
		System.out.println(a);
		System.out.println("q1");
	}
	Q(String s1)
	{
		this(123l);
		System.out.println(s1);
		System.out.println("q2");
	}
	Q(long l)
	{
		super("jana",123l);
		System.out.println(l);
		System.out.println("q3");
	}
	
	public static void main(String[] args) {
		m1();
		Q q1 = new Q(123);
		System.out.println(p.i);
	}
	}
	
	

