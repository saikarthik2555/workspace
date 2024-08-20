package com.HashMap;

import java.util.HashMap;

public class HashCodeDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(129, "A");
		hm1.put(129, "B");
		
		System.out.println(hm1.size());		//1 
		
		System.out.println(hm1);	

	}

}
