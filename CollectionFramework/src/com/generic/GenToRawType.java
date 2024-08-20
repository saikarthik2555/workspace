package com.generic;

import java.util.ArrayList;
import java.util.List;

public class GenToRawType {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(56);
		al.add(78);
		al.add(90);
		Unknown i=new Unknown();
		ArrayList num=new ArrayList<>();
		num.addAll(i.getValues(al));
		for(int j=0;j<num.size();j++) {
			if(num.get(j) instanceof Integer) {
				System.out.println("Object type");
			}
		}
		System.out.println(num);
	}

}
class Unknown{
	public List getValues(List l) {
		ArrayList a=new ArrayList();
		for(int i=0;i<l.size();i++) {
			int num=(Integer)l.get(i);
			a.add(num);
		}
		return a;
		
	}
}