package com.datam.SpringExample;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	


	public void drive()
	{
		System.out.println("Bhag rahi hai");
	}
}
