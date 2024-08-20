package com.method_returntype;

import java.util.Date;

public class MethodReturnType {
	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			System.out.println("Enter "+i+" Employee details ");
			Employee emp=Employee.getData();
		System.out.println(emp);
		}
		
	}
	}
	
