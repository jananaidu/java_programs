package lakshmi_pg_pratice;

import java.util.Scanner;

public class strong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
//		int n = sc.nextInt();
		for(int j = 1;j<=m;j++)
		{
		int num = j;
		int sum = 0;
		int temp=num;
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i = 1;i<=rem;i++)
			{
				fact = fact*i;
			}
			sum = sum + fact;
			num/=10;
		}
		
//		System.out.println(sum);
		if(sum==j)
		{
			System.err.println(sum+"strong num");
		}
//		else
//			System.out.println("not strong num");
	}
}
}
