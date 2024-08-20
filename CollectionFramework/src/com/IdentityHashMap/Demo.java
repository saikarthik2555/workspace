package com.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("sunday", 12);
		hm.put("sunday", 15);
		hm.put(new String("sunday"), 18);
		System.out.println(hm);
		System.out.println();
		IdentityHashMap<String,Integer> id=new IdentityHashMap<>();
		id.put("sunday", 12);
		id.put("sunday", 15);
		id.put(new String("sunday"), 18);	
		System.out.println(id);
	}

}
