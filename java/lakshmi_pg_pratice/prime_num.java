package lakshmi_pg_pratice;

import java.util.Scanner;

public class prime_num {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i = m;i<=n;i++)
		{
			int num=i;
			int count=0;
			int j = 1;
			while(j<=num)
			{
				if(num%j==0)
					count++;
				j++;
			}
			if(count==2)
				System.out.println(num+" "+"prime num");
			else
				System.out.println("not prime no");
		}
		
		
	}

}
