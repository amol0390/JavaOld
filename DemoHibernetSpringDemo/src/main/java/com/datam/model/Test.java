package com.datam.model;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    StudentDao dao=(StudentDao)factory.getBean("d");  
	    
	    
//	    int status=dao.saveStudent(new Student(102,"Pooja"));  
//	    System.out.println(status);  
//	    
//	    System.out.println(student.toString());  
	    dao.listStudents();
	}

	
}
