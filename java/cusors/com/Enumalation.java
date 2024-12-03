package cusors.com;


import java.util.Enumeration;
import java.util.Vector;

public class Enumalation {

	public static void main(String[] args) {
		
//		Vector<String> v1 = new Vector<String>();
//		
//		v1.addElement("hello");
//		v1.addElement("jana");
//		v1.addElement("hello");
//		v1.addElement("jana");
//		v1.addElement("hello");
//		v1.addElement("jana");
//		
//		Enumeration e = v1.elements();
//		while(e.hasMoreElements())
//		{
//			Integer i = (Integer) e.nextElement();
//			String s = (String)e.nextElement();
//			if(s=="naidu")
//			{
//				System.out.println("hiii");
//			}
//			else if(i==12)
//			{
//				System.out.println("int");
//			}
//			System.out.println(v1);
//		}
		Vector v2 = new Vector();
		for(int i = 0;i<=14;i++)
		{
			v2.addElement(i);
		}
		System.out.println(v2);
		Enumeration e1 = v2.elements();
		while(e1.hasMoreElements())
		{
			Integer i =(Integer)e1.nextElement();
			if(i%2==0)
			{
				System.out.println("even");
			}
			System.out.println(i);
		}
	
	}
	
	
	
}
