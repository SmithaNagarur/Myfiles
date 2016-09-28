package com.study.java;

public class CheckOddEven {

	 //Write a program called CheckOddEven which prints "Odd Number" if the int variable
	//“number" is odd, or “Even Number” otherwise.
	
	
	public void evenOddCheck(int number){
	if ((number%2)==0){
		System.out.println("Number is Even" + "---" + number);
	}
	else {
		System.out.println("Number is Odd" + "---"  + number);
	}
	
	}
	public static void main(String[] args) {

    CheckOddEven EO = new CheckOddEven();
    EO.evenOddCheck(12);
	}
    	
	}


