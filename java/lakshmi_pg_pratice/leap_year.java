package lakshmi_pg_pratice;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0 && (year%400==0|| year%100!=0))
			System.out.println("leap year");
		else
			System.out.println("not leap year");
	}
}
