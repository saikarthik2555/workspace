package com.task_13feb;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
	public static List convertToList(String[] inputArray) {
		List<String> a=new ArrayList<>();

		for(int i=0;i<inputArray.length;i++) {
			a.add(inputArray[i]);
		}
		return a;
		
	}
}
