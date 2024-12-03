import java.util.Scanner;

public class sample {
	
	sample(int a,int b)
	{
		
		this("jana",143);
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	sample(String c,int d)
	{
		this(12,"i love too");
		System.out.println(c+"i love u");
	}
	sample(int f,String e)
	{
		
		this(123,8688206066l);
		
		System.out.println(e+"  darling");
	}
	sample(int h,long l)
	{
		this();
		System.out.println(l+"phonenum");
	}
	sample()
	{
		System.out.println("hii babu");
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sample s = new sample(a,b);
	
	}


	
	
}
	

