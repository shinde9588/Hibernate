package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		
	SessionFactory ft = new Configuration().configure().buildSessionFactory();
	Session st = ft.openSession();
	
	 Employees h1 = new Employees();
	 ((Employees) h1).setEmp_id(1);
	 h1.setF_name("omkar");
	 h1.setL_name("shinde");
	 h1.setSalary(50000);
	 
	 Employees h2 = new Employees(2,"Sankalp","Oimbe",500000);
	 Employees h3 = new Employees(3,"nikhil","karande",400000);
	 Employees h4 = new Employees(4,"Jayesh","Khairnar",740000);
	 Employees h5 = new Employees(5,"Prasad","Mali",450000);
	 Employees h6 = new Employees(6,"Gaurav","vagh",600000);
	 
	 Transaction tx = st.beginTransaction();
	 st.save(h1);
	 st.save(h2);
	 st.save(h3);
	 st.save(h4);
	 st.save(h5);
	 st.save(h6);
	 
	 tx.commit();
	 st.close();
	 ft.close();
	 
		
	}

}
