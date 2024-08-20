package com.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedGetUserData {
	public static void main(String[] args) {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id ");
		try {
			int id=Integer.parseInt(b.readLine());
			System.out.println(id);
			System.out.println("Enter Name");
			String name=b.readLine();
			System.out.println(name);
			System.out.println("Enter Gender");		//wrong
			char ch=b.readLine().charAt(0);
			System.out.println(ch);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
