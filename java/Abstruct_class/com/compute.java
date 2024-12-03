package Abstruct_class.com;

abstract class compute{

	public abstract int compute(int a,int b);
}
class addition extends compute
{
	@Override
	public int compute(int a,int b)
	{
		return a+b;
	}
}
class subtraction extends compute
{
	@Override
	public int compute(int a,int b)
	{
		return a-b;
	}
}
class mul extends compute
{
	@Override
	public int compute(int a,int b)
	{
		return a*b;
	}
}
class div extends compute{
	@Override
	public int compute(int a,int b)
	{
		return a/b;
	}
}