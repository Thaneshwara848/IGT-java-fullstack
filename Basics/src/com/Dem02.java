package com;
import java.util.Scanner;
class Emp
{	
	int id,age;
	double salary;
	String name, desig;
	
	Emp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the ID :  ");
		 id=sc.nextInt();

		System.out.print("Enter The name : ");
		 name= sc.next();
		
		System.out.print("Enter the Age  :  ");
		 age=sc.nextInt();

		System.out.print("Enter the Salary :  ");
		 salary=sc.nextDouble();

		System.out.print("Enter The Designation : ");
		 desig= sc.next();
		
	}
	public void display(){
			System.out.println("===========");
			System.out.println("ID :"+id);
			System.out.println("NAME :"+name);
			System.out.println("AGE :"+age);
			System.out.println("SALARY:"+salary);
			System.out.println("DESIGNATIOn:"+desig);
		}
}
class Dem02
{
	public static void main(String args[])
	{
	
		Emp e = new Emp();
		e.display();
	}

} 