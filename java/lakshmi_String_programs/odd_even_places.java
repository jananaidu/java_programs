package lakshmi_String_programs;

public class odd_even_places {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "helloworld";
		
		for(int i=1;i<s.length();i=i+2)
		{
			
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("================");
		
		for(int i=0;i<s.length();i=i+2)
		{
			System.out.print(s.charAt(i));
		}
	}
		
	}


