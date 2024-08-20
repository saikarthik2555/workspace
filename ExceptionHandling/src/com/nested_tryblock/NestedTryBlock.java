package com.nested_tryblock;

import java.util.InputMismatchException;

public class NestedTryBlock {
	public static void main(String[] args) {
		try {
			String name="null";
			System.out.println(name.length());
			try {
				String y="12d";
				int num=Integer.parseInt(y);
//directly main because of not matching with exception provided in
//catch block so jumps to caller method
//if unsuccess it again jumps to main
			}catch(InputMismatchException f) {
				System.out.println("Insert only integers"+f); //doubt
			}
		}catch(NullPointerException e) {
			System.out.println("Cannot find length of null reference");
		}
		
	}

}
