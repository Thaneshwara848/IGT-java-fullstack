package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factroy=cfg.buildSessionFactory();
		
		Employee e= new Employee();
		
		e.setUid(100);
		e.setName("ABI");
		e.setAge(25);
		e.setSalary(234567);
		e.setDesig("Developer");
		
			// Usins scanner class 
		
//		e.setUid(uid);
//		e.setName(name);
//		e.setAge(age);
//		e.setSalary(salary);
//		e.setDesig(desig);
	
		Session session=factroy.openSession();
	
		Transaction tx= session.beginTransaction();
		session.save(e);
		System.out.println("Data Inserted Successfully....!");
	}

}
