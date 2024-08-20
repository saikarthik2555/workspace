package com.task_13feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {
	public Duplicates() {
		
	}
	public static List<Integer> getDuplicatesList(ArrayList<Integer> a) {
		ArrayList<Integer> s=new ArrayList<>();
		s.ensureCapacity(0);
		s.add(0);
		s.add(1,0);
		s.add(2,0);
		s.add(3,0);
		s.add(4,0);
		s.add(5,0);
		s.add(6,0);
		s.add(7,0);
		int visited=-1;
		for(int i=0;i<a.size()-1;i++) {
			System.out.println(a.size());
			int count=1;
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i)==a.get(j)) {
					count++;
					s.set(j, visited);
				}
					if(s.get(i)!=visited) {
					s.set(i,count);
			}
		}
		}
		for(int i=0;i<s.size();i++) {
			if(s.get(i)!=visited && s.get(i)==2) {
			System.out.print(a.get(i)+":  "+s.get(i)+" ");
			}
		}
		return s;
	}
	public static void main(String[] args) {
		List<Integer> numberList=Arrays.asList(33,45,67,89,33,47,21,45);
		ArrayList<Integer> a=new ArrayList<>(numberList);
		List<Integer> duplicates=getDuplicatesList(a);
		System.out.println(duplicates);
	}	
}









