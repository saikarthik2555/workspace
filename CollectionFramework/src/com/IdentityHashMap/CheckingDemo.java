package com.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;


public class CheckingDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Today is Leap Day", 27);
		hm.put(new String("Today is Leap Day"), 29);
		String name="Today is Leap Day";
		System.out.println(name.hashCode()+" "+name.hashCode()%16);
		System.out.println(hm.size()+" "+hm);
		System.out.println(hm.hashCode());
		IdentityHashMap<String,Integer> im=new IdentityHashMap<>();
		im.put("Thursday", 27);
		im.put("Thursday", 28);
		im.put(new String("Thursday"), 29);
		System.out.println(im.size()+" "+im);
		System.out.println(System.identityHashCode(im));
	}
}
