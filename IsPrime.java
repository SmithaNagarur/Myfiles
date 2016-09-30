package com.study.java;


/*Write a program to check a given number is prime or not.
 *  1. check the num is graeter than 1.. if <= 1 return false.. else continue
 * 2. check the num is not divisible by 2 to n-1.. if divisble by any of them return false.. else continue
 * 3. return true
 */

public class IsPrime {

	//Logic 1
	boolean isPrime(int n) {
		if(n<=1){
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++ ){
			if( n% i == 0) {
				return false;
		}
		}
		return true;
		
	}

	//Logic 2
	boolean isPrime1(int num){
			if (num<=1){
				return false;
			}	
			for (int i = 2 ; i<num ; i++  ){
				if(num%i == 0){
					return false;
			}
	}	
			return true;
	}
	
	public static void main(String[] args) {
	IsPrime pr = new IsPrime();
	if(pr.isPrime(317)){
	System.out.println("Its Prime");
	}
	else{
		System.out.println("its not Prime");
	}
	}
}
		


