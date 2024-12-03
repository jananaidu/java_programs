package janademo.com;

import java.util.Scanner;

public class mainabstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("enter a number......");
		int a = sc.nextInt();
		int b = sc.nextInt();
		add a1 = new add();
		System.out.println(a1.compute(a,b));
		sub s1 = new sub();
		System.out.println(s1.compute(a, b));
		div d1 = new div();
		System.out.println(d1.compute(a, b));
		String s = sc.next();
		System.out.println(a1.m1(s));
		System.out.println(s1.m1(s));
		
		
		
	}

}
