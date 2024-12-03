package inerit;

public class p {

	static int i = 100;
	public p(int i,String k)
	{
		
		System.out.println(i+" "+k);
		System.out.println("p1");
	}
	public p(long j,int t)
	{
		
		this(12,"i love u");
		System.out.println("p2");
		System.out.println(j+" "+t);
	}
	p(String s,long l1)
	{
		
		this(123l,12);
		System.out.println("p3");
		System.out.println(s);
	}
}
