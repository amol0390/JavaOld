package com.datam.SpringJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	  public static void main(String[] args) {
	      ApplicationContext ctx = 
	         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	      helloWorld.setMessage("Hello World!");
	      helloWorld.getMessage();
	   }
	}