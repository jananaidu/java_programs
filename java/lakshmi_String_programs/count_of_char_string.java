package lakshmi_String_programs;

public class count_of_char_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int count1=0;
		int count2=0;
		int count3=0;
		String s = "JANA";
		s=s.concat("NAIDU");
		char ch = s.charAt(2);
		System.out.println(ch);
		System.out.println("=================");
		System.out.println(s.length());
		System.out.println("================");
		System.out.println(s.charAt(5));
		System.out.println("=====================");
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)=='A')
				count1++;
			else if(s.charAt(i)=='i')
				count2++;
			else if(s.charAt(i)=='D')
				count3++;
		}
		System.out.println(count1+" "+"A");
		System.out.println(count2);
		System.out.println(count3);
	}

}
