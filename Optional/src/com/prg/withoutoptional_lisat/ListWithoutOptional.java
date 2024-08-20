package com.prg.withoutoptional_lisat;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutOptional {
	public static void main(String[] args) {
		List<String> str=new ArrayList<>();
		str.add("today");
		str.add("is");
		str.add("tuesday");
		str.add("ramnagar");
		str.add(null);
		
		for(String s:str) {
			System.out.println(s.length());		//exception
		}
	}

}
