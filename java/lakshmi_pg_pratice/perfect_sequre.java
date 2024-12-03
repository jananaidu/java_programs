package lakshmi_pg_pratice;

import java.util.Scanner;

public class perfect_sequre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
		int n = sc.nextInt();
		int count=0;
		for(int i = 0;i<=n;i++)
			if(i*i==n)
				count++;
		if(count==1)
			System.out.println("perfect squre");
		else
			System.out.println("not perfect sequre");	
		
	}

}
