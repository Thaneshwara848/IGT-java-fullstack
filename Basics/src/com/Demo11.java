class A
{
	public void abc()
	{
		System.out.println("A class abc method");
	}
}
class B extends A  
{
	public void abc()
	{
		System.out.println("B class abc method");
	}
}
class Demo11
{
	public static void main(String args[])
	{
		B  b = new B();
		b.abc();
	}
}
// same method name + different paramanetr + multiple times + in same class = method over loding ...!
//same Constructro name + different paramanetr + multiple times + in same class = Constructro over loding ...!
// over riding == same method name + in child class 