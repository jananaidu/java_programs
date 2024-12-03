package lakshmi_String_programs;

import java.util.Scanner;

public class Splitarry_reve {

	
	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		String s1 = "jana naidu varaprasad";
		String splitArray[]=s1.split(" ");
		for(int i = splitArray.length-1;i>=0;i--)
		{
			System.out.println(splitArray[i]);
			
		}
	}
	
	
	
}
