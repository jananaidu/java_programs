package Abstruct_class.com;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		addition a1 = new addition();
		System.out.println("addition of two numbers"+a1.compute(a,b));
		subtraction s1 = new subtraction();
		System.out.println("sub of two num "+s1.compute(a,b));
		mul m1 = new mul();
		System.out.println("mul of two num "+m1.compute(a, b));
		div d1 = new div();
		System.out.println("div of two num "+d1.compute(a, b));
		
	
	}

}
