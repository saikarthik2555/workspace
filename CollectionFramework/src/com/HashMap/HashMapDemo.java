package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Smith", 456);
		m.put("Miller", 123);
		m.put("Smith", 234);
		m.put(null, null);
		m.put(null, 0);
		System.out.println(m);
//		System.out.println(m.get(null));
//		System.out.println(m.get("Karthik"));		//null
		//if we want to fetch Like cursor one by one
		//Iterator is not available in Map so to convert Map to Set we use entry.set()
		
		//m.entrySet()--> Set<Map.Entry<K, V>> entrySet();
		//Map.Entry is an Interface
		for(Map.Entry n:m.entrySet()) {			
			System.out.println(n.getKey()+" "+n.getValue());
		}
		}

}
