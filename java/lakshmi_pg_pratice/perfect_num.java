package lakshmi_pg_pratice;

import java.util.Scanner;

public class perfect_num {

	public static void main(String[] args) {
		;
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int j=m;j<=n;j++)
		{
		int num = j;	
		int sum =0;
		for(int i = 1;i<=num/2;i++)
		{
			if(num%i==0)
				sum = sum + i;
			
		}
		if(sum == num)
			System.err.println("perfect num"+" "+sum);
		else
			System.out.println("not perfect num");
		
	}
	}
}
