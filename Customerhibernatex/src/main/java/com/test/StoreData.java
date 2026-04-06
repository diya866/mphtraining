package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session session=sf.openSession()
;

	
	Transaction t=session.beginTransaction();
Customer emp=new Customer();
emp.setC_name("Rohit");
emp.setC_company("BCC");
emp.setC_city("Mumbai");
//session.persist(emp);

Customer obj=session.find(Customer.class, 1);
System.out.println(obj.getId()+" "+obj.getC_name()+" "+obj.getC_company()+" "+obj.getC_city());
obj.setC_name("Sharma");
obj.setC_company("PWC");
obj.setC_city("Banglore");
session.persist(obj);
t.commit();
System.out.println("Done ");
session.close();
	}
}
