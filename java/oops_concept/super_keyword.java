package oops_concept;

public class super_keyword {

	static String s = "jananaidu";
	String a = "hello world";
	long pho_num = 8688206066l;
	
	public super_keyword(String a, long pho_num) {
		super();
		this.a = a;
		this.pho_num = pho_num;
		System.out.println(a);
		System.out.println(pho_num);
	}
	public static void m1()
	{
		System.out.println("hiiii");
		
	}
	public  void m2()
	{
		System.out.println("non static method");
		
	}
	public String m3()
	{
		m1();
		m2();
	return "return type";
		
	}
	public static void main(String[] args) {
		super_keyword s = new super_keyword("jana",8688);
		System.out.println(s.m3());
		
	}
	
}
 
