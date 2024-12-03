package lakshmi_pg_pratice;

import java.util.Scanner;

public class fibonacciseries {
	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		 
		System.out.println(a+" "+b);
		for(int i = 0;i<=num;i++)
		{
			int c = a+b;
			 System.out.print(c);
			a=b;
			b=c;
		}
		
		
	}	
}
