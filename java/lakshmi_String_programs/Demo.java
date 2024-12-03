package lakshmi_String_programs;

public class Demo {

	public static void m1()
	{
	String str = "i_love_darling";
	String rev = "";
	for(int i =str.length()-1;i>=0;i--)
	{
		rev = rev + str.charAt(i);
	}
	System.out.println(str);
	System.out.println(rev);
	for(int j =1;j<=str.length()-1;j=j+2)
	{
		System.out.println(str.charAt(j));
	}
	System.out.println("==================");
	for(int k = 0;k<=str.length()-1;k=k+2)
	{
		System.out.println(str.charAt(k));
	}
	}

	public static void main(String[] args) {
		
		m1();
		
		
		
		
		
	}
	
}
