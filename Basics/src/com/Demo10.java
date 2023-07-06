class Emp
{
	void abc()
	{
		System.out.println("Hi abc()");
	}
	void abc(int a )
	{
		System.out.println("Hello abc(int a )");
	}
	void abc(int a, int b )
	{
		System.out.println("Hello abc()"+(a+b));
	}
	
}
class Demo10
{
	public static void main(String args[])
	{
		Emp e = new Emp();
		e.abc();
		e.abc(100);
		e.abc(100,200);
	}
}
// same method name + different paramanetr + multiple times + in same class = method over loding ...!
//same Constructro name + different paramanetr + multiple times + in same class = Constructro over loding ...!