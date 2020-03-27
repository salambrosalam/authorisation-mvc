package com.salambrosalam.springdemo.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		String b = "bro";
		
		Authorisation a = new Authorisation();
		
		a.check_user(b);
		
	

	}
//	public boolean check_user_a(String a) {
//		
//		SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Authorisation.class)
//				.buildSessionFactory();
//		
//		//create session
//		
//		Session session = factory.getCurrentSession();
//		
//		Object loginList; 
//		
//
//		
//		try {
//			
//		
//		session.beginTransaction();
//		
//		session.clear();
//		
//
//		String log = "SELECT login FROM authorisation.users where login LIKE '123'";
//
//
//		loginList = session.createQuery(log).getSingleResult();
//		
//		
//		
//		
//		
//		session.getTransaction().commit();
//		System.out.println("You are good hacker bro)");
//
//		
//		
//		}finally {
//			factory.close();
//			session.close();
//		}
//		
//		
//		    if (loginList == null) {
//		    	System.out.println("User is not exist");
//		    	return true;
//		    }return false;
//		    
//		    
//		    
//	}

}
