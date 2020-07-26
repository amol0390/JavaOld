package com.datam.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List; 
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StudentDao {  
private JdbcTemplate jdbcTemplate;  
private static SessionFactory factory;   
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveStudent(Student e){  
    String query="insert into Student values('" + e.getRollno() + "','Python','"+e.getName()+"','Delhi')";  
    return jdbcTemplate.update(query);  
}  
public int updateStudent(Student e){  
    String query="update Student set name='"+e.getName()+"' where id='"+e.getRollno()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteStudent(Student e){  
    String query="delete from Student where id='"+e.getRollno()+"' ";  
    return jdbcTemplate.update(query);  
}  
  

public void listStudents( ){
    Session session = factory.openSession();
    Transaction tx = null;
    
    try {
       tx = session.beginTransaction();
       List students = session.createQuery("FROM Student").list(); 
       for (Iterator iterator = students.iterator(); iterator.hasNext();){
    	   Student student = (Student) iterator.next(); 
          System.out.print(" Name : " + student.getName()); 
          System.out.print("  Couse: " + student.getCourse()); 
          System.out.println("  Salary: " + student.getClass()); 
       }
       tx.commit();
    } catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
 }

}  
