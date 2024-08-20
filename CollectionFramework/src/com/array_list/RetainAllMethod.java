package com.array_list;

import java.util.ArrayList;

public class RetainAllMethod {
	public static void main(String[] args) {
	  ArrayList<String> al3=new ArrayList<>();
	  al3.add("Ravi");
	  al3.add("Rahul");
	  al3.add("Rohit");		  
	  
	  ArrayList<String> al4=new ArrayList<>();
	  al4.add("Pallavi");
	  al4.add("Rahul");
	  al4.add("Raj");
	  
	  al3.retainAll(al4);  	//common data

    al3.forEach(x -> System.out.println(x));		  
	}
}
