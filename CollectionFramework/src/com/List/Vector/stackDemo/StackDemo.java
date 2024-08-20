package com.List.Vector.stackDemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango"); 						
		System.out.println("Offset Position not index sai karthik is : "
		+stk.search("Mango")+" "+stk.indexOf("Mango"));
	
		System.out.println("Offset Position is : " + stk.search("Banana")); //-1
	    System.out.println("Is stack empty ? "+stk.empty());	//false
		
		System.out.println("Index Position is : " + stk.indexOf("Mango")); //2						
        
 }
}
