class A
{
		String name="Charan";
}
class B extends A
{
	String name="Bindu";
	public void display(String name)
	{
			System.out.println("Hi "+name);		// abi
			System.out.println("Hi "+this.name);	// bindu
			System.out.println("Hi "+super.name); // charan
	
	}
}
class Demo8
{
	public static void main(String args[])
	{
	
		B b = new B();
		b.display("Abi");
	}
}