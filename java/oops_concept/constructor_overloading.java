package oops_concept;

import java.util.Scanner;

public class constructor_overloading {

	

	constructor_overloading(int a,int b)
	{
		
		this("jana",143);
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	constructor_overloading(String c,int d)
	{
		this(12,"i love too");
		System.out.println(c+"i love u");
	}
	constructor_overloading(int f,String e)
	{
		
		this(123,8688206066l);
		
		System.out.println(e+"  darling");
	}
	constructor_overloading(int h,long l)
	{
		this();
		System.out.println(l+"phonenum");
	}
	constructor_overloading()
	{
		System.out.println("hii babu");
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		constructor_overloading s = new constructor_overloading(a,b);
	
	}


}
