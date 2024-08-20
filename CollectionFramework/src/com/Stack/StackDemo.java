package com.Stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		s.push("Apple");  
		s.push("Grapes");  
		s.push("Mango"); 						
		s.push("Apple");  
		s.push("Grapes");  
		s.push("Mango");  
		s.push("Orange");  
		System.out.println("Index Position is : " + s.indexOf("Mango")); //2
		System.out.println(s.indexOf("Apple"));		//LIFO
		System.out.println("Element at top/Last  "+s.peek()); 	//Orange
		System.out.println(s);

	//	s.pop();			//Exception
		s.add(12);
		s.add(14);
		s.push(150);			//to add
		s.push(200);
		System.out.println("answer"+s);
		System.out.println(s.peek());		//to get
		System.out.println(s.pop());		//to show and remove LIFO
		System.out.println(s.toString());				//toString
		System.out.println(s.search(150));	
		s.push(12);									//to add
		s.push(new Integer(15));
		s.push(Integer.valueOf(20));
		s.push(17);
		System.out.println(s);
		
		s.pop();	//pop No Obj as paramater
		//pop removes element at top/last
		
		System.out.println(s);
		System.out.println(s.search(12));	//index
		System.out.println(s);
		System.out.println(s.peek());		//returns offset element at top/last
		System.out.println(s);
		System.out.println(s.isEmpty());//from collection/List
		System.out.println(s.empty());
	}

}
