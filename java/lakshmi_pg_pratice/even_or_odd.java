package lakshmi_pg_pratice;

import java.util.Scanner;

public class even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int num = m;
		for(int i = m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "even number");
				
			}
			if(i%2==1)
			{
				System.out.println(i + "odd number");
				
				
			}
//			else
//			{
//				System.out.println("default values");
//			}
		}
		
	}

}
