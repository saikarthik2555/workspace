package com.ioException;
import java.io.*;
public class UnsupportedEncodingExceptionDemo {
	public static void main(String[] args) {
		String name="ABCDEFGH";
		//byte []bytes=name.getBytes("UDF");	
		//UnsupportedEncodingException
		
//this method used to print asci values of String	

//BEST METHOD to convert String to Array

		byte []bytes=name.getBytes();
		for(byte b:bytes) {
			System.out.print(b+" ");
		}
		
		
		
		
//		for(int i=0;i<bytes.length;i++) {
//			System.out.print(bytes[i]+" ");
//		}
	}

}
