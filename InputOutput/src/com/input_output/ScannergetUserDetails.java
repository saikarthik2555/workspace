package com.input_output;

import java.util.Scanner;

public class ScannergetUserDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=s.nextInt();				//no need of ParseInt
		System.out.println(id);
		System.out.println("Enter Name");
				String name=s.nextLine();
				name=s.nextLine();
				System.out.println(name);
				System.out.println("Enter Gender");	//Scanner also wrong output
				char c=s.next().charAt(0);
				System.out.println(c);
	}

}
