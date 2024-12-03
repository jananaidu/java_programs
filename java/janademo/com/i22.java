package janademo.com;

 interface i22 {
	void start();
}
interface i33 extends i22
{
	public abstract void begin();
}
interface i44
{
	void end();
}
class child1 
{
	public void m1()
	{
		System.out.println("m1 method");
	}
}
class child2 extends child1 implements i33,i44 
{
	@Override
	public void end() {
		// TODO Auto-generated method stub
		System.out.println("byeeeeeeeeeeeeeeeee");
	}

	@Override
	public void begin() {
		// TODO Auto-generated method stub
		System.out.println("hayyyyy........");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("hiiiiiiiii???????");
//		public static void main(String [] args)
//		{
//			child2 ch = new child2();
//			ch.m1();
//			ch.start();
//			ch.begin();
//			ch.end();
//		}
	}
}
