package lakshmi_pg_pratice;

import java.util.Scanner;

public class neon_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int squ = num*num;
		int sum=0;
		while(squ>0)
		{
			int rem = squ%10;
			sum = sum+rem;
			squ/=10;
		}
		if(sum==num)
			System.out.println("neon num");
		else
			System.out.println("not neon num");
		
		
	}

}
