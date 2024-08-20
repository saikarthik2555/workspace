package com.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader d=new BufferedReader(i);
		System.out.println("Enter Id");
		int id=Integer.parseInt(d.readLine());
		System.out.println(id);	  		//not suitable for int type so introduced ParseInt
//		String id1=d.readLine();
//		System.out.println(id1);
		if(id>18) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not eligible");
		}
		System.out.println("==============================");
		System.out.println("Enter malr or female");
		int ch=d.read();
		System.out.println(ch);
	}

}
