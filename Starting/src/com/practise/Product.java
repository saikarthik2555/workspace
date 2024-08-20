package com.practise;

import java.util.Scanner;

public class Product{
int productId=1;
String productName="Dell";
public void setProductName() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id");
	productId=sc.nextInt();
	System.out.println("Enter Name");
	productName=sc.nextLine();
	productName=sc.nextLine();
}
public void showStudentdata() {
	System.out.println(productId);
	System.out.println(productName);
}
public static void main(String[] args) {
	Product laptop=new Product();
//if company says to give details 
	laptop.showStudentdata();
//if company says it want to change details 
	laptop.setProductName();
	laptop.showStudentdata();
	
}
}