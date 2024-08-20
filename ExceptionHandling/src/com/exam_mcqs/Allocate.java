package com.exam_mcqs;
class DontDivideByZero extends RuntimeException{
	public DontDivideByZero() {
		
	}
	public DontDivideByZero(String message) {
	super(message);
	}
}
public class Allocate {
	public static void main(String[] args){
		int num=12;
		int div=0;
		if(num/div!=0) {
			throw new DontDivideByZero("Invalid");
		}
		else {
			System.out.println(num/div);
		}	
		}
	}
