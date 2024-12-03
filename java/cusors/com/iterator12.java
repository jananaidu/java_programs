package cusors.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iterator12 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		for(int i= 0;i<=10;i++)
		{
			l1.add(i);
		}
		Iterator i2 =l1.iterator();
		while(i2.hasNext())
		{
			Integer i3 = (Integer)i2.next();
			if(i3%2==0)
				System.out.println(i3);
			else
				i2.remove();
			
		}
		System.out.println(i2);
		
	}
	
	
	
}
