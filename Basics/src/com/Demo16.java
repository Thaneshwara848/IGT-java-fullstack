abstract class Bank
{
	abstract void loan();
	abstract void account();
	// if i want to make somthing comulsory to execute then we are using abstract 
}
class Sbi extends Bank
{
	void loan()	
	{
			System.out.println("Edu ");
	}
	void account()
	{
	}
} 
class Axis extends Bank
{
	void loan()	
	{
			System.out.println("edu + personal ");
	}
	void account()
	{
	}
}
class Demo16
{
	public static void main(String args[])
	{
		Sbi s =new Sbi();		
		s.loan();

		Axis a = new Axis();
		a.loan();
	}
}

Ebbani 
gagan c
Rajesh
angana das , abiraj , girijesh
kamal kant, maheshwari 
yesh R Pandya 
yogesh










	class 								Abstract class 				Interface 

	1) class Demo							abstract class Demo{}			interface I{}
	{}

	2 ) abstraction : 0 					0-100%						100% abstraction 


	3 ) obj : yes 							no 							no 

	4 ) Constructor : yes 					yes 							no  ....?
	5 )int a;const 						yes : const 					no ? no const

	6) multyple inheritance ? no 				no 							yes we achiv muiltyple inheritance 
	
	














