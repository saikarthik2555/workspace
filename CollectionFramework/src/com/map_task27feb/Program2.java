package com.map_task27feb;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program2 {
	public static void main(String[] args) {
		Map<String,String> m=new LinkedHashMap<>();
		String arr[]={"Code","Bug"};
		for(String str: arr) {
			m.put(str.substring(0,1), str.length()-1+"");
		}
		
	
	}

}
