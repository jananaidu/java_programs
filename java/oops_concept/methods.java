package oops_concept;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class methods {

//	pass no value return no value
	public static void m1()
	{
		System.out.println("hii frds how are you");
	}
//pass no value return some value
	public static String m2()
	{
		System.out.println("");
		return "yes tell mee darling";
	}
//pass some value return no value
	public static void m3(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
//pass some value return some value
	public static long m4(String s)
	{
//		s.concat("jana");
		System.out.println("i love u "+s);
		return 8688206066l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new Scanner(System.in);
		m1();
		System.out.println(m2());
		String s = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		m3(a,b);
		System.out.println(m4(s));
	}

}
