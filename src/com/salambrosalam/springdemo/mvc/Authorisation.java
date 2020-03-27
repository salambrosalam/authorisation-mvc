package com.salambrosalam.springdemo.mvc;

import javax.validation.constraints.NotEmpty;


import javax.validation.constraints.NotNull;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.Expression;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.validator.constraints.Email;
import org.springframework.lang.NonNull;
import org.springframework.test.annotation.IfProfileValue;




@Entity
@Table(name="users")
public class Authorisation {
	
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="login")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String login;
	
	@Column(name="password")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String password;
	

	
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
			
	public void registration(String login, String password) {
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Authorisation [login=" + login + ", password=" + password + "]";
	}



	public Authorisation(
			String login,
			 String password) {
		this.login = login;
		this.password = password;
	}

	public Authorisation() {
		
	}
	
	public boolean check_user(String a) {
	
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Authorisation.class)
				.buildSessionFactory();
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		Object loginList; 
		Object psswdList; 

		
		try {
			
			Authorisation theAuth = new Authorisation();
		
		session.beginTransaction();

		String log = "from Authorisation s where s.login LIKE '" + a + "'" ;


		List<Object> response = session.createQuery(log).list();
		
		System.out.println(response);
		
		
		
		
		session.getTransaction().commit();
		System.out.println("You are good hacker bro)");

		 if (response.isEmpty()) {
		    	System.out.println("this user not exist");
		    	return true;
		    }return false;
		
		}finally {
			session.close();
		}
		
		
		  
		    
	}
	
	
	
	public void write_data(String a, String b) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Authorisation.class)
				.buildSessionFactory();
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		
		// add an initbinder ... to convert trim input strings
		// remove leading and trailing whitespace
		// resolve issue for our validation
		
		try {
			
	
		
		//create the objects
//		Instructor tempInstructor = new Instructor("Georege", "Klark", "salam@gmail.com");
//		
//		InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com/salamChannel", "salam");
		
		Authorisation tempAuthorisation = new Authorisation(a,b);
		
		//start a transaction
	
		
		session.beginTransaction();
		
		//save the student object
		System.out.println("Create new user: "  + tempAuthorisation);
		session.save(tempAuthorisation); 
		//commit the transaction
		session.getTransaction().commit();
		
		System.out.println("You are good hacker bro)");
		
	}finally {
		factory.close();
		
	}

		
	}

}