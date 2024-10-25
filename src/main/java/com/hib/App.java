package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.setId(106);
	emp1.setAge(20);
	emp1.setName("saravan");
	emp1.setDomain("manager");
	Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);

	SessionFactory sf=con.buildSessionFactory();
	
Session session=sf.openSession();
Transaction t=session.beginTransaction();
	session.save(emp1);
	t.commit();
	}

}
