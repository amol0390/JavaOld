package com.datam.SpringExample;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	public String brand;
//
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	@Override
	public String toString() {
		return "It is working";
	}

	public String getBrand() {
		return brand;
	}

	
	
//	public void setBrand(String brand) {
//		// TODO Auto-generated method stub
//		this.brand = brand;
//	}
	

}
