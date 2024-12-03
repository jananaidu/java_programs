package Run_time_poly;

import java.util.Scanner;

public class playstore {

		public microsoft getInstall(String name)
		{
			if(name.equals("microsoft"))
				return new microsoft();
			else if(name.equals("excel"))
				return new Excel();
			else if(name.equals("word"))
				return new Word();
			else
				return null;
	}
}
class mainInstall
{
	public static void main(String[] args) {
		
		playstore p = new playstore();
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("enter the product name");
		String name = sc.next();
		microsoft ref = p.getInstall(name);
		ref.install();
	}
}