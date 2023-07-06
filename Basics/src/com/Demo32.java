class Car extends Thread
{
	public void run()	
	{
		try{
			for(int i=0;i<=25;i++)
			{
				
				if(Thread.currentThread().getName().equals("Benz"))
				{
						System.out.println(" "+Thread.currentThread().getName()+":"+ i);
				}
				if(Thread.currentThread().getName().equals("AUDI"))
				{
						System.out.println("	 "+Thread.currentThread().getName()+":"+ i);
				}
				if(Thread.currentThread().getName().equals("Maruthi"))
				{
						System.out.println(" 		"+Thread.currentThread().getName()+":"+ i);
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{}
	}
}
class Demo32
{
	public static void main(String args[])
	{
		Car c = new Car();

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		
		t1.start();t2.start();t3.start();

		t1.setName("Benz");t2.setName("AUDI");t3.setName("Maruthi");

		try{
			for(int i=0;i<=25;i++)
			{
				System.out.println(" 					I  :"+ i);
				if(i==10)
						t1.suspend();
				if(i==13)
					System.out.println(t3.isAlive());
				if(i==15)
						t1.resume();
				if(i==12)
					t3.stop();
				if(i==20)
					System.out.println(t3.isAlive());
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}