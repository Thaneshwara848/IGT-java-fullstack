import java.util.*;
class Demo25
{
	public static void main(String args[])
	{
			m1();
	}
	static void m1()
	{
		m2();
			System.out.println("M1 method....!");
	}
	static void m2()
	{
		m3();
			System.out.println("M2 method....!");
	}
	static void m3()
	{
		try
		{
			System.out.println("M3 method....!");
			Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter A val");
			int a = sc.nextInt();
			
			System.out.println("Enter A val");
			int b = sc.nextInt();
			int res= a / b;
			System.out.println("Result is :"+res);
		
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Hi Boss dont use / 0 please enter some other numebr");
		}
		catch(InputMismatchException ie)	
		{
				System.out.println("Please enterchar only ");
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
		finally
		{
				System.out.println("Thank you ....!");
		}
	}
}