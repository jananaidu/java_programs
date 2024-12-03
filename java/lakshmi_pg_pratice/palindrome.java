package lakshmi_pg_pratice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int n = sc.nextInt();
		
		int tem = num;
		int sum = 0;
		int rev = 0;
		while(tem>0)
			{
				int rem = tem%10;
				rev = (rev*10) + rem;
				tem = tem/10;
			}
		
		if(rev == num)
			System.out.println("palindrome num");
		else
			System.out.println("not palindrome num");
		
	}

}
