package com;

public class Employee {
	
	// ID , NAME , AGE , SALARY , DESIG 
	
	private int uid;
	private String name;
	private String city;
	private int ph;
	
	
	
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display()
	{
		System.out.println(uid + " :" +name + " "+city+ " : "+ph);
	}
	
	

}
