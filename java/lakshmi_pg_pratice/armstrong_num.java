package lakshmi_pg_pratice;

import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int j = m;j<=n;j++)
		{
		int num = j;	
		int temp = num;
		int temp1 = temp;
		int sum = 0;
		int count = 0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		while(temp>0)
		{
			int rem = temp%10;
			
		int prod=1;
		for(int i=1;i<=count;i++)
		{
			prod = prod*rem;
			
		}
		temp/=10;
		sum = sum + prod;
		}
//		System.out.println(sum);
//		System.out.println(num);
		if(sum==temp1)
			System.err.println("armstrong num"+" "+sum);
		else
			System.out.println("not armstrong num");
	}

}
}
