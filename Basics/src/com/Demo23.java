//final class Car // if i make class as final : we cant inherit ...!
class Car
{
		final int maxspeed =250;// we cant change the value : kind of const in C prog 
		String name="BENZ";
		//final void carbreak() // cannot override
		void carbreak()
		{
			System.out.println("Hi Benz...! cost 50,00,000");
		}
}
class B extends Car
{	
		void carbreak()
		{
			System.out.println("Hi Benz...! cost 55,00,000");
		}
}
class Demo23
{
	public static void main(String args[])
	{
		Car c = new Car();
		System.out.println(c.maxspeed); // 250 
		//c.maxspeed=3000;
		//System.out.println(c.maxspeed); //3000
		System.out.println("===========================");
		B b = new B();
		System.out.println(b.name);// nobody has to inherit ....!
		b.carbreak();				// nobody has to inherit ....!
		
	}
}
// if its a var : we cant re assign 
// if its is a method : we cant not ovverride 
// if its class we cant inherit 