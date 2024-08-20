package com.Map;

import java.util.HashMap;

public class PutIfAbsent {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "first");
		//hm.put(1, "second");
		hm.putIfAbsent(1, "second");	//if key is already exiting 
		//then it will not insert entry
		System.out.println(hm);
		
		
		
	}

}
