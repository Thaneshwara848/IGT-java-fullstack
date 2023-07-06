class Emp
{
		Emp()
		{	this(100);
			System.out.println("Hi EMPloyee ");
		}
		Emp(int id)
		{
			this(100,"Abi");
			System.out.println("Hi Demo");
		}
		Emp(int id,String name)
		{
			this(100,25,"Suresh");
			System.out.println("Hi Demo int , String ");
			
		}
		Emp(int id,int age,String desig)
		{
			System.out.println("Hi Demo id age , name");
		}
}
class Demo9
{
	public static void main(String args[])
	{
		Emp e = new Emp();
		//Emp e1 = new Emp(100);
		//Emp e2 = new Emp(100,"Suresh");
		//Emp e3= new Emp(100,25,"Suresh");
	}
}
// constructor  overloading === same const name +  with diff parameter+ muiltyple time + in same class = over loding
					