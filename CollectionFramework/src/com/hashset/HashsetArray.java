package com.hashset;

import java.util.Arrays;
import java.util.HashSet;

public class HashsetArray {
	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<>();
		boolean arr[]=new boolean[9];
		arr[0]=true;
		arr[1]=h.add(12);
		arr[2]=h.add(34);
		arr[3]=h.add(12);	//false because duplicate
		arr[4]=h.add(32);
		arr[5]=h.add(42);
		arr[6]=h.add(100);
		arr[7]=h.add("Smith");
		arr[8]=h.add("miller");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String s=Arrays.toString(arr);
		System.out.println(s);
		System.out.println(Arrays.toString(arr));
		char ch[]=new char[5];
		ch[0]='Z';
		ch[1]='A';
		ch[2]='E';
		ch[3]='S';
		ch[4]='B';
		System.out.println(ch);
		Arrays.sort(ch);
		System.out.println(ch);
	}

}
