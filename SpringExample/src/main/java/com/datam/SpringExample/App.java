package com.datam.SpringExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
      
      ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
      
  	Vehicle obj = (Vehicle)context.getBean("car");
  	obj.drive();

//    Tyre obj1 = (Tyre)context.getBean("tyre");
//    
//   // obj1.setBrand("CEAT");
//    System.out.println(obj1);
//    
    }
}
