package com.hib;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.transform.Transformers;

import jakarta.persistence.criteria.CriteriaBuilder;

public class App {

	public static void main(String[] args) {
//		Address a=new Address();
//		a.setCity("srivilliputtur");
//		a.setPincode(626125);
//		a.setStreet("uranipatti");
//	Employee emp1=new Employee();
//	emp1.setId(101);
//	emp1.setName("muni");
//	emp1.setAge(30);
//	emp1.setDomain("fullstackdev");
//	emp1.setAddress(a);
		
//		Laptop lap=new Laptop();
//		lap.setLid(101);
//		lap.setLname("lenovo");
//	
//		
//		Student s=new Student();
//		s.setName("muni");
//		s.setRollno(1);
//		s.setMarks(85);
//		s.getLaptop().add(lap);
//		lap.getStudent().add(s);
	
//	emp1.setId(106);
//	emp1.setAge(20);
//	emp1.setName("saravan");
//	emp1.setDomain("manager");
	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);

	SessionFactory sf=con.buildSessionFactory();
	
Session session=sf.openSession();

Transaction t=session.beginTransaction();
           NativeQuery query = session.createNativeQuery("select name,marks from student where marks>60");
           query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
                  List<Map<String, Object>> students = query.list();
                  for (Map<String, Object> student : students) {
					System.out.println("Name :" + student.get("name") + ", Marks: " + student.get("marks"));
				}
//            List students = query.list();
//            for(Object o:students) {
//            	System.out.println(0);
//            }
//Random random = new Random();
//      for(int i=1;i<=50;i++) {
//    	  Student s = new Student();
//    	  s.setRollno(i);
//    	  s.setName("Name"+ i);
//    	  s.setMarks(random.nextInt(100));
//    	  session.save(s);
//      }
//    Query q=session.createQuery("select sum(marks) from Student s where s.marks> :b");
//    q.setParameter("b", b);
//  Long marks= (Long)q.uniqueResult();
//  System.out.println(marks);
//   List<Object[]> Students =(List<Object[]>) q.list();
//   for(Object[] Student:Students) {
//	   System.out.println(Student[0] + " :" + Student[1] + " :" + Student[2]);
//	    
//   }
  
//    List<Student> students = q.list();
//    for(Student s:students) {
//    	System.out.println(s);
//    }
//      
	t.commit();

	
	}

}
