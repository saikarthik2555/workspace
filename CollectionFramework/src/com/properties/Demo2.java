package com.properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		Properties p=System.getProperties();
//		Set s=p.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext()) {
//			Map.Entry entry=(Map.Entry)itr.next();
//			System.out.println(entry.getKey()+" "+entry.getValue());			
//		}
		for(Map.Entry m: p.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
