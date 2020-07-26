package com.datam.SpringJavaConfig;

public class HelloWorld {
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public String getMessage1(){
		      return "Your Message : " + message;
		   }
	}
