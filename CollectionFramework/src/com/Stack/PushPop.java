package com.Stack;

import java.util.Stack;

public class PushPop {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(12);
		s.push(78);
		s.push(56);
		s.push(78);
		s.push(34);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		Stack<String> stk= new Stack<>();  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango"); 						
		System.out.println("Offset Position is : " + stk.search("Mango")); //1			

	}
}
