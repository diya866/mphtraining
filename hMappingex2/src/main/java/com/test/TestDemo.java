package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Order o1 = new Order();
		o1.setO_name("Lifestyle");
		o1.setO_price("345");
		Order o2 = new Order();

		o2.setO_name("Education");
		o2.setO_price("45");
		List<Order> list = Arrays.asList(o1, o2);
		User u = new User();
		u.setU_name("SKY");
		o1.setUser(u);
		o2.setUser(u);
		u.setOrder(list);
		session.persist(u);
		t.commit();
	}

}
