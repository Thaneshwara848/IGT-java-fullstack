class A
{
	int a = 100;
	int b = 200;
	void add()
	{
		System.out.println("A + B  : "+ (a+b) );
	}
}
class B extends A
{
	//int a=100;
	//int b=200;
	int c=10;
	int d=20;

	//void add()
	//{
	//	System.out.println("A + B  : "+ (a+b) );
	//}
	void mul()
	{
		System.out.println("A  * B  : "+ (a*b) );
	}	
}
class Demo3
{
	public static void main(String args[])
	{
		A a = new A();
		a.add();
		B b = new B();
		b.add();
		b.mul();	
	}
}

// code re use 
// can we reduse lentgh of code 
// if  code length is small ===> performance of the application good 