package com.beforeScanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	//Before Scanner we have 2 classes 
	//DataInputStream		-- may producre wrong results
	//BufferedReader		--Buffer best  bcoz readrs from buffer and stores data in buffer
	public static void main(String[] args) throws IOException {
		System.out.println("Enter Your Gender");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bd=new BufferedReader(isr);
		char gender=bd.readLine().charAt(0);
		if(gender=='m'||gender=='f') {
		System.out.println(gender);
		}else {
			System.out.println("Enter charater Only");
		}
	}

}
