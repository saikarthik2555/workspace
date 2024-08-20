package com.HashMap;

import java.util.HashMap;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();			 
		hm.put(1, "JSE");  
		hm.put(2, "JEE");
		hm.put(3, "JME"); 
		hm.put(4,"JavaFX");
		hm.put(5,null);
		hm.put(6,null);
		
		System.out.println("Initial map elements: " + hm); 
		hm.clear();	
		System.out.println("Map elements after clear: " + hm);	
	}

}
