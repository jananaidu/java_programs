package janademo.com;

public abstract class abstruct123 {

	abstract public int compute(int a,int b);
	abstract public String m1(String s);
}
class add extends abstruct123
{
	public int compute(int a,int b)
	{
		return a+b;
	}

	@Override
	public String m1(String s) {
		// TODO Auto-generated method stub
		return s;
	}
}
 class sub extends abstruct123
{
	public int compute(int a,int b)
	{
		return a-b;
	}
	@Override
	public String m1(String s) {
		// TODO Auto-generated method stub
		return s;
	}
}
class div extends abstruct123
{
	public int compute(int a,int b) {
		return a/b;
	}
	public String m1(String s)
	{
		return s;
	}
}