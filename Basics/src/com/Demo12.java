class Bank
{
	public void loan()
	{
		System.out.println("10%");
	}
}
class SBI extends Bank  
{	
}
class Axis extends Bank  
{	
	public void loan()
	{
		System.out.println("12%");
	}
}
class Hdfc extends Bank  
{	
}
class Demo12
{
	public static void main(String args[])
	{
		Hdfc h= new Hdfc();h.loan();
		Axis a = new Axis();a.loan();
	}
}