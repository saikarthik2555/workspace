package com.task_13feb;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	public Student(Integer studentId,String studentName,Double studentFees) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentFees=studentFees;
	}
	public static Student getStudentObject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id ");
		Integer studentId=sc.nextInt();
		System.out.println("Enter Student Name");
		String studentName=sc.nextLine();
		studentName=sc.nextLine();
		System.out.println("Enter Student Fees");
		Double studentFees=sc.nextDouble();
		return new Student(studentId,studentName,studentFees);
		}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ "]";
	}
	
	
}
