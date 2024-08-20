package com.Map;

import java.util.HashMap;

public class HashMapDemo1 {
public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("A", 1);										//65
	hm.put(new String("A"), 2);
	//System.out.println(new String("A").hashCode());		//65
	System.out.println(hm.size());
	System.out.println(hm);
}
}
