package com;

public class Employee {

	private int uid;
	private String name;
	private String city;
	private int ph;
	public Employee(int uid, String name, String city, int ph) {
		super();
		this.uid = uid;
		this.name = name;
		this.city = city;
		this.ph = ph;
	}
	
	
	void display() {
		System.out.println("ID :"+uid);
		System.out.println("NAME :"+name);
		System.out.println("City :"+city);
		System.out.println("Phone : "+ph);
	}
}
