package lakshmi_pg_pratice;

import java.util.Scanner;

public class happy_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
		int num = sc.nextInt();
		
//		for(int i=m;i<=n;i++)
//		{
//			int num = i;
			while(num!=1&&num!=0)	
			{
				int sum=0;
				while(num>0)
				{
					int rem = num%10;
					int squ = rem*rem;
					sum = sum+squ;
					num/=10;
				}
//				System.out.println(sum);
				num = sum;
			}
			if(num==1)
				System.out.println(num+"\t"+"happy num");
		}
	}


