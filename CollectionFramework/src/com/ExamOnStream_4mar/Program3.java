package com.ExamOnStream_4mar;

import java.util.LinkedList;
import java.util.List;

public class Program3 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,6};
		LinkedList<Integer>tm=new LinkedList<Integer>();
		for(int i=0;i<arr.length;i++) {
		tm.add(arr[i]);
		}
		List<Integer> l=tm.stream().distinct().toList();
		System.out.println(l.size()!=arr.length);
		
	}
}
