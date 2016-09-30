package com.study.java;

/*Write a program to demonstrate Constructor overloading*/

public class ConstructorsEx {

	String type = null;

	
	public ConstructorsEx(){
		type = "no argument constructor";
		System.out.println("there are no arguments");
	}
	
	public ConstructorsEx(int a, int b, int c){
		type = "3 argument constructor";

	System.out.println((a+b)*c);
	}
	public ConstructorsEx(int res){
		type = "1 argument constructor";

		if((res<10) && (res>5)){
			res+=  res;
			System.out.println(res);
		}
		else{
			System.out.println(res + "is graeter than 10");
		}
		
	}
	public ConstructorsEx(String d){
		type = "1 String argument constructor";

		System.out.println(d);
		
	}
	
	public String toString(){
		return type;
	}
	
	public static void main(String[] args){
		System.out.println(new ConstructorsEx()); 
		System.out.println(new ConstructorsEx(6));
		System.out.println(new ConstructorsEx(2,3, 4));
		System.out.println(new ConstructorsEx("constructorsclass" ));

 
	    
		

	}

}
