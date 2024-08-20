package com.generic;

import java.util.ArrayList;
import java.util.List;

public class GenToRawTypeOrg {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(56);
		al.add(78);
		al.add(90);
		Sample s=new Sample();
		int values=s.addValues(al);
		System.out.println(values);
	}

}
class Sample{
	public int addValues(List l) {
		l.add(350);	
	//	l.add("Hello");
		int total=0;
		for(int i=0;i<l.size();i++) {
			total+=(int)l.get(i);
		}
		return total;
	}
}