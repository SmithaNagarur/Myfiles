package com.study.java;

public class Usingthis {
	
	/* Write a program to demonstarte the this keyword*/
	
	int a = 1;
	String name = "Smith";
	double value = 20.09;
	
	public void display(int a){
		
		System.out.println(this.a);
		this.temp();
	}

	public void temp(){
		System.out.println("temp is called");
	}
	public static void main(String[] args){
		
		Usingthis th = new Usingthis();
		
		th.display(2);
	}

}


