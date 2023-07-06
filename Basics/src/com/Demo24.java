import java.util.*;
class A
{
	Scanner sc= new Scanner(System.in);
	A()
	{
		try
		{
			System.out.println("ENter the PIN :");
			int pin = sc.nextInt();

			System.out.println("PIN :"+pin);
		}
		catch(InputMismatchException im)
		{
			System.out.println("Hy Boss please enter only number ....!");
		}
	}
}
class Demo24
{
	public static void main(String args[])
	{
	
			A a = new A();
	}
}