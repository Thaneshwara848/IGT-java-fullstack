class A extends Thread
{
	public void run()	
	{
		try{
			for(int i=0;i<=10;i++)
			{
				System.out.println(" I  :"+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{}
	}
}
class B extends Thread
{
	public void run()	
	{
		try{
			for(int i=0;i<=10;i++)
			{
				System.out.println(" 	 J  :"+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{}
	}
}
class Demo31
{
	public static void main(String args[])
	{
		A a = new A();a.start();
		B b = new B();b.start();
	}
}