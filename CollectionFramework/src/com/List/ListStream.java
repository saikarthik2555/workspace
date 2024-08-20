package com.List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ListStream {
	public static void main(String[] args) {
		HashSet<String> stk= new HashSet<>();  
		List<String> l= Arrays.asList("Sunday","Monday","Tuesday","Wednesday");
		System.out.println(l.size());
		stk.addAll(l);
		System.out.println(stk);
////		stk.push("Apple");  
////		stk.push("Grapes");  
////		stk.push("Mango");  
////		stk.push("Orange");  
////		System.out.println("Stack: " + stk);  
////		
////		String fruit = stk.peek(); 	
////		//String fruit1=stk.poll();
////		//System.out.println("removes the eleemnt"+fruit1);
////		System.out.println("Element at top: " + fruit);  
////		System.out.println("Stack elements are : " + stk); 
//		stk.add("Sunday");
//		stk.add("Monday");
//		stk.add("Tuesday");
//		stk.add("Wednesday");
//		stk.add("Thursday");
//		stk.add("Friday");
//		stk.add("Saturday");
//		stk.push("Holiday");
////		String removed=stk.poll();
////		String get=stk.peek();
////		System.out.println(removed);
////		System.out.println(get);
////		System.out.println(stk);
//	    stk.forEach(t-> System.out.print(t));
//		Iterator<String> il=stk.descendingIterator();
//		il.forEachRemaining(t -> System.out.println(t));

	}

}
