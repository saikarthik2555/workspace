package com.ExamOnStream_4mar;

import java.util.LinkedList;

public class Program2 {
	public static void main(String[] args) {
		LinkedList sen=new LinkedList();
		
		String name="i have a sentance with technical words";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				sen.add(name.charAt(i));
			}
		}
		System.out.println(sen);
	}
}
