abstract class A
{
	 abstract void abc();
}
abstract class B extends A
{
	B()
	{
	
	}
	void abc()
	{
		System.out.println("Abc method");
	}
	abstract void xyz();
}
class C  extends B
{
	 void xyz()
		{
			System.out.println("xyz method");
		}
}
class Demo14
{
	public static void main(String args[])
	{
		C  c= new C();
		c.abc();
		c.xyz();
	}
}
				class										Abstract class 

1) 				nonrmal or concret method 						can contain both abstract + noraml methods 
2) 				can we create ab obj ? yes 						No 
3) 				class Demo{}								abstract class Demo{}
4)				C(){}										yes we can create a constructor
				
