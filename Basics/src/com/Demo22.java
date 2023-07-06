class A
{
	static int salary=50000;
	static void display()
	{
		System.out.println("Hi Display method....!");
	
	}

}
class Demo22
{
	public static void main(String args[])
	{
		//A  a = new A();
		//a.display();
		//System.out.println(a.salary);

		A.display();
		System.out.println(A.salary);
	}
}