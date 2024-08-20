package com.try_block;

public class NegativeArraySizeException {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5]; //NegativeErrorSizeException
			arr[-2]=5;
		}
		catch(Exception e) {
System.out.println(e.getMessage()); //only message
System.out.println(e);	//message + package name
e.printStackTrace();		//Full details
//Exception method--> main
//Exception name--> java.lang.NegativeArraySizException
//Exception package name--> com.try_block
//Exception line number --> line 7
//Exception message		
		}
	}

}
