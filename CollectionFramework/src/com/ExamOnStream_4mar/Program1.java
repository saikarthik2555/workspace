package com.ExamOnStream_4mar;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(10);
		lst.add(30);
		lst.add(20);
		lst.add(10);
		lst.add(20);
		lst.add(30);
		List<Integer> sortedList=lst.stream().distinct().sorted().toList();
		System.out.println(sortedList);

	}

}
