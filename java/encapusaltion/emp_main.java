package encapusaltion;

import java.util.Scanner;

public class emp_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee e2 = new Empolyee();
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("enter id num");
		int id = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter address");
		String Adress = sc.next();
		System.out.println("enter the loc");
		String loc = sc.next();
//		System.out.println(e2.getId()+","+e2.getName()+","+e2.getAdress()+","+e2.getLoc());
		System.out.println(id+","+name+","+Adress+","+loc);
//		System.out.println(e3.getId()+","+e3.getName()+","+e3.getAdress()+","+e3.getLoc());
		
		
	}

}
