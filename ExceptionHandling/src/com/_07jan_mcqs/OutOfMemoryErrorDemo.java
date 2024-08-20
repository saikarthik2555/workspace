package com._07jan_mcqs;

public class OutOfMemoryErrorDemo {
	public static void main(String[] args) {
//		try {
//			throw new OutOfMemoryError();	
//			//Error not Exception
//		}catch(Exception e) {
//			System.out.println("Im not printing");
//			System.out.println(e.getMessage());
//		}
		try {
			throw new OutOfMemoryError();	
		//	Throwable is the super class
		}catch(Throwable e) {
			System.out.println("Im not printing");
			System.out.println(e.getMessage());
		}
	}

}
