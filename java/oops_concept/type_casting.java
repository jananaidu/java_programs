package oops_concept;

public class type_casting {

	
	int a = 100;
	String s = "jananaidu";
	int b = a;
	String s1 = s;
	short s2 = (short)b ;
	private void syso() {
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s);
		System.out.println(b);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		type_casting t = new type_casting();
		t.syso();
	}

}
