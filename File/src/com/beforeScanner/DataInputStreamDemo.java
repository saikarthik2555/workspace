package com.beforeScanner;

import java.io.DataInputStream;
import java.io.IOException;
public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter your gender");
//		System.out.println(dis.read());			//drawback   for thoery go to other class i.e above Buffer Reader
//		System.out.println("charcater  "+(char)dis.read());
		
		//Solution
		char gender=dis.readLine().charAt(0);
		System.out.println(gender);
		
	}
}
