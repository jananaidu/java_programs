package lakshmi_String_programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class remove_duplicates_2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		String s = sc.next();
		removeDuplicates(s);
		System.out.println(removeDuplicates(s));
		
	}
	public static String removeDuplicates( String s)
	{
		Set<Character> set = new HashSet();
		StringBuffer sf = new StringBuffer();
		for(int i = 0;i<s.length();i++)
		{
			Character ch = s.charAt(i);
		
		if(!set.contains(ch))
		{
			set.add(ch);
			sf.append(ch);
		}
		}
		return sf.toString();
		
	}
	
}
