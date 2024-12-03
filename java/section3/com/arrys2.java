package section3.com;

import java.util.ArrayList;

public class arrys2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("mava");
		a1.add("hello world");
		a1.add("jananaidu");
		for(String s:a1)
		{
			int count=0;
			if(s.startsWith("m")||s.endsWith("a"))
			{
				count++;
				System.out.println(s);
				System.out.println(count);
			}
		}
	}

}
