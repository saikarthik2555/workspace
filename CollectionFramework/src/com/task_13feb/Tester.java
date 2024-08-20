package com.task_13feb;

import java.util.Arrays;

import java.util.List;

public class Tester {
	//Arrays.asList implementation
	public static void main(String[] args) {
		String[] inputArray= {"Sunday","Monday","Tuesday"};	//Datatype must be same
         List<String> s=ArrayToList.convertToList(inputArray);
         
       
     System.out.println(s);    
	}
}
