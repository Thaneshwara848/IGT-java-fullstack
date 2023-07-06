class Parent
{
	int site=5;
	String car="Benz";
	int money=500000;

	void pdata()
	{
		System.out.println("P site : "+site);
		System.out.println("P CAR : "+car);
		System.out.println("P money : "+money);
	}
}
class Child extends Parent  
{
	int money=200000;
	void pdata()
	{
		System.out.println("P site : "+site);
		System.out.println("P CAR : "+car);
		System.out.println("C money : "+money);
	}
}
class Demo4
{
	public static void main(String args[])
	{
			Parent p = new Parent();p.pdata();
			Child c = new Child();c.pdata();	
	}
}
// aquare the proprty from ( parent to child )  or (super to sub ) or (base to derived)
