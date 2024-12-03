package lakshmi_pg_pratice;

import java.util.Scanner;

public class spy_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		int prod = 1;
		while(num>0)
		{
			int rem = num%10;
			sum = sum + rem;
			prod = prod*rem;
			num/=10;
			
		}
		if(sum==prod)
			System.out.println("spy num");
		else
			System.out.println("not spy num");
			
	}

}
