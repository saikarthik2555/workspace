package com.practise;

import java.util.Date;
import java.util.Scanner;

public class Student {
private int sId;
private String sName;
private double sFees;
private Date d;

public Student(int sId,String sName,double sFees,Date d) {
	this.sId=sId;
	this.sName=sName;
	this.sFees=sFees;
	this.d=d;
	}

	public static Student getStudentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter fees");
		double fees=sc.nextDouble();
		Date d=new Date();
		sc.close();
		return new Student(id, name, fees, d);
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sFees=" + sFees + ", d=" + d + "]";
	}

}
