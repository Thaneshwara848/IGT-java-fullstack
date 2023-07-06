abstract class A
{
	int a;
	A()
	{	
	}
	abstract void abc();
	abstract void xyz();
}
class B extends A
{
	B(){}
	void abc()
	{
		System.out.println("Abc method");
	}
	void xyz()
	{
		System.out.println("xyz method");
	}	
}
class Demo15
{
	public static void main(String args[])
	{
		B  b = new B();
		b.abc();
	}
}