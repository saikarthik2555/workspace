package com.practise;

import java.util.Scanner;

public class Product {
	System s;				//has  a relation
	int pId;
	String pName;
	Scanner sc=null;				//has a relation
	
	
	public static void main(String[] args) {
	Product p1=new Product();
	String s[]= {"sds"};
	new Data().main(s);				//Calling Data class main method
	
	p1.setProductData();
	System.out.println(p1);
	
	}
	 
	 public void setProductData() {
		 sc=new Scanner(System.in);				
		 pId = sc.nextInt();
		 pName= sc.nextLine();
		 pName=sc.nextLine();
		 
	 }
	 @Override
	 public String toString() {
		 return "Product [pId=" + pId + ", pName=" + pName + ", sc=" + sc + "]";
	 }
}

class Data{
	Product p;		//ref instance
	public static void main(String[] args) {
			Product p=new Product();
			System.out.println(p.pId);		
			//instance variable can be used/accessible anywhere with object reference
			System.out.println(p.pName);
	}
}
