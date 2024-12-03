package polymerisphism.com;

import java.util.Scanner;

public class ploy_main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter stream");
		String stream = sc.next();
		System.out.println("enter branch");
		String branch = sc.next();
		System.out.println("enter coures");
		String coures = sc.next();
		System.out.println("enter mob_num");
		long mob_num = sc.nextLong();
		
//		System.out.println("enter1:print name");
		System.out.println("enter 1 : print name");
		System.out.println("enter 2 : print name and stream, branch");
		System.out.println("enter 3 :print name and coures");
		System.out.println("enter 4: print all detils");
		int n = sc.nextInt();
		
		jspqsp pq = new jspqsp(name,stream,branch,coures,mob_num);
		if(n == 1)
		{
			pq.m1(name);
		}
		else if(n == 2)
		{
			pq.m1(name,stream,branch);
		}
		else if(n==3)
		{
			pq.m1(name, coures);
		}
		else if(n==4)
		{
			pq.m1(name,stream,branch,coures,mob_num);
		}
		
		
	}

}
