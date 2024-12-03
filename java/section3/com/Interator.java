package section3.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Interator {

	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		
//		ArrayList<StringBuffer> a2 = new ArrayList<StringBuffer>();
		a1.add(12);
		a1.add(123);
		a1.add(1234);
		a1.add('d');
		a1.add(12345);
		a1.add(123456);
		a1.add("java");
		a1.add("mava");
		a1.set(7, "bava");
		System.out.println(a1.get(4));
		System.out.println(a1.indexOf("mava"));
		System.out.println(a1.lastIndexOf("java"));
		System.out.println(a1.lastIndexOf('d'));
		System.out.println(a1.get(4));
//		a1.remove(2);
//		a1.remove("java");
//		a1.addAll(a1);
		a1.addAll(4, a1);
		a1.add(3,'j');
//		a1.removeAll(a1);
//		a1.clear();
		a2.add("i");
		a2.add("love");
		a2.add("you");
		a1.addAll(a2);
		System.out.println(a1.size());
		System.out.println(a1.contains("bava"));
		System.out.println(a2);
		System.out.println(a1.indexOf("you"));
		System.out.println(a2);
		System.out.println(a1.containsAll(a2));
		System.out.println(a1);
		a1.clear();
		System.out.println(a1.isEmpty());
		
		ListIterator l1 = a1.listIterator();
//		
//		while (l1.hasNext()) {
//			System.out.println(l1.next());
//		}
			System.out.println("==============");
			while(l1.hasPrevious())
			{
				System.out.println(l1.previous());
			}
	}

	
}
