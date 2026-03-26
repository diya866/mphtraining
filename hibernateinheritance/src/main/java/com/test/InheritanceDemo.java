package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceDemo {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction t = session.beginTransaction();
	Vehicle vobj=new Vehicle();
	vobj.setV_name("Car");
	vobj.setLisenceNumber(132);
	TwoWheeler tobj=new TwoWheeler();
	tobj.setV_name("Bike");
	tboj.setSteeringHandle("Bike Steering");
	FourWheeler fobj=new FourWheeler();
	fobj.setV_name("Tesla");
	fobj.setSteeringHandle("Car Steering");
	
	
	
	
}
