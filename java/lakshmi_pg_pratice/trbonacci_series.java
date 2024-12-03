package lakshmi_pg_pratice;

import java.util.Scanner;

public class trbonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  a = 1,b=0,c=1;
		int d = a+b+c;
		System.out.println(a+"\t"+b+"\t"+c);
		int i = 4;
		while(i<=n)
		{
		System.out.println("\t"+d);
		a=b;
		b=c;
		c=d;
		d=a+b+c;
		i++;
		
		}
		
	}

}
