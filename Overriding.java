package com.study.java;

public class Overriding extends ParentClass {

	
	/* Write a program to demonstrate method overriding using any real scenario.
	 * Show What are inherited and what are the item overrided and why is it overrided.
	 * Use a Super keyword*/
	
	@Override
	 public void phone(String type){
		// System.out.println("Child class has overridden");
		 super.phone("Andriod");
	 }
	

	public static void main(String[] args) {
		Overriding or = new Overriding();
		//ParentClass pr= new ParentClass();
		
		or.texting();
		or.calling();
		or.phone("IOS");
	   
		
		
	}

}
