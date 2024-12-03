import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(m1(s));
		System.out.println(m2(s));
		System.out.println(m3(s));
		System.out.println(m4(s));
		
		m1(s);
		
	}
	public static String m1(String s)
	{
		
		m2(s);
		return "jana143";
	}
	public static String m2(String s)
	{
		m3(s);
		return "jana123";
	}
	public static String m3(String s)
	{
		m4(s);
		return "jana1234";
	}
	public static String m4(String s)
	{
		
		return "jana12345";
	}
	

}
