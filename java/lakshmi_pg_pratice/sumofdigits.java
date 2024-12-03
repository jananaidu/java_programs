package lakshmi_pg_pratice;

import java.util.Scanner;

public class sumofdigits 
{
	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		int prod = 1;
		while(num>0)
		{
			int rem = num%10;
			sum = sum + rem;
			prod = prod * rem;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(prod);
	}
}
