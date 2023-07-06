class Parent
{
	Parent()
	{
		System.out.println(" Parent ");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println(" Child ");
	}
}
class Demo5
{
	public static void main(String args[])
	{
			//Parent p = new Parent();
			Child c = new Child();
	}
}
// as soon as u create a child class object 
// automaticall it will the parent class  default constructor...!