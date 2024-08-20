package com.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Orange","Mango","Grapes","Pineapple");
		ArrayList<String> ar1=new ArrayList<>(names);
		// or
		//ar1.addAll(names);
		ar1.forEach(t -> System.out.println(t));
		
	}

}
