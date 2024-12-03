package polymerisphism.com;

public class jspqsp {

	String name;
	String stream;
	String branch;
	String coures;
	Long mob_num;
	public jspqsp(String name, String stream, String branch,String coures, Long mob_num) {
		super();
		this.name = name;
		this.stream = stream;
		this.branch = branch;
		this.coures=coures;
		this.mob_num = mob_num;
	}
	public void m1(String name)
	{
		System.out.println("student details");
		System.out.println(name);
//		System.out.println(mob_num2);
	}
	public void m1(String name,String stream,String branch)
	{
		System.out.println("student details");
		System.out.println(name);
		System.out.println(branch);
		
	}
	public void m1(String name,String coures)
	{
		System.out.println("student details");
		System.out.println(name);
		System.out.println(coures);
		
	}
	public void m1(String name,String stream,String branch,String coures,Long mob_num)
	{
		System.out.println("student details");
		System.out.println(name);
		System.out.println(stream);
		System.out.println(branch);
		System.out.println(coures);
		System.out.println(mob_num);
		
	}
	
	
	
}
