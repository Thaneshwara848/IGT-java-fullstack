
class Demo
{	int a;
	Demo(){}
}
abstract class B
{
	B(){}
	abstract void xyz1();
	abstract void xyz3();	
}
interface I 
{
	int a = 100; 
	//I(){}
	abstract void abc();
	abstract void xyz();
}
interface J 
{
}
interface K extends I , J
{
}
class Demo18
{
	public static void main(String args[])
	{
			Demo d = new Demo();
			//	B b = new B();
			//I i = new I();
	}
}
			