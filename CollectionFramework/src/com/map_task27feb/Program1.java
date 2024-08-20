package com.map_task27feb;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program1 {
	public static void main(String[] args) {
		Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		//String arr[]= {"a", "bb", "a", "bb"};
		String arr[]= {"this","and","that","and"};
		
		for(String s:arr)
		{
			m.put(s, s.length());
		}
		System.out.println(m);
	}

}
