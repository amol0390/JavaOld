package com.datam.SpringExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.datam.SpringJavaConfig.HelloWorld;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    
	HelloWorld h = new HelloWorld();
	
	@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        
    }
	
	 @Test
		
	   public void testAdd() {
	      String str = "Junit is working fine";
	      assertEquals("Junit is working fine",str);
	   }
 @Test
 
 public void testHelloMessage()
 {
	 h.setMessage("Hello Amol"); 
	
	 assertEquals("Hello",h.getMessage1());
	 
 }

}
