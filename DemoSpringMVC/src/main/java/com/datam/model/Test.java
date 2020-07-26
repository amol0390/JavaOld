package com.datam.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  

	    StudentDao dao=(StudentDao)context.getBean("edao");  
	    
	    
	    int status=dao.saveStudent(new Student(102,"Amit"));  
	    System.out.println(status);  
	    
//	    System.out.println(student.toString());  
	
	}

	
}
