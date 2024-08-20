package com.linked_list;

import java.util.LinkedList;

public class ListPushPop {
	public static void main(String[] args) {
		LinkedList<String> stk= new LinkedList<>();  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango");  
		stk.push("Orange");  
		System.out.print("Stack: " + stk);  //Push --> add elements to top on top
		System.out.println();
		String fruit = stk.peek(); 	
		String fruit1=stk.poll();
		System.out.println("Element at top: " + fruit);  
		System.out.println("removed element : "+fruit1);
		System.out.println("Stack elements are : " + stk); 
	 
		stk.add("Sunday");			//adding down of last push element
		stk.add("Monday");
		stk.add("Tuesday");
		stk.add("Wednesday");
		stk.add("Thursday");
		stk.add("Friday");
		stk.add("Saturday");
		//stk.push("Holiday");
		System.out.println(stk.remove());
		System.out.println(stk.poll());
		System.out.println(stk.peek());
		System.out.println(stk);		
	}
}
