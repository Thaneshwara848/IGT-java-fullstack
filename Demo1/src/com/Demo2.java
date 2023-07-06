package com;
import java.util.Scanner;
class A
{
	A()
	{
		Scanner sc= new Scanner(System.in);

		System.out.println(" Enter ID :");
		int id=sc.nextInt();

		System.out.println(" Enter name :");
		String name=sc.next();

		System.out.println("Name is : "+name);
		System.out.println("ID is : "+id);
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		A a= new A();	
	}
}