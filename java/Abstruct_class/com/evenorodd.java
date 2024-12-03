package Abstruct_class.com;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc  = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i = m;
		for(;i<=n;i++)
		{
			if(i%2==0)
				System.err.println("even numbers"+" "+i);
			else
				System.out.println("odd numbers"+" "+i);
		}
	}

}
