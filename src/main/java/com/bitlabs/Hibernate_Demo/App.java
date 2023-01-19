package com.bitlabs.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Hibernate_Demo.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=null;   // to maintain list of sessions:  CRUD
    	
    	// load hibernate.cfg.xml file.
    	
    	
    	
    	
    	
    	sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	if(sf!=null) {
    	System.out.println("hi");
    	}
    	
    	Session session=sf.openSession();   // DML  --> delete,insert,update

    	 Transaction txn=session.beginTransaction();
    	 Student std=new Student();
     	std.setSid(101);
     	std.setName("aaa");
     	std.setGender("male");
     	std.setEmail("aaa@gmail.com");
     	std.setCity("Hyd");
    	 session.save(std);
    	 
    	 txn.commit();
    	
    	session.close();
    	
    }
}
