package com.List.Vector;
import java.util.ArrayList;
import java.util.Vector;
public class Performance {
	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		Long startTime =System.currentTimeMillis();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<10000000;++i) {
			a.add(i);
		}
		Long endTime=System.currentTimeMillis();
		System.out.println("The differences in ArrayList "+(endTime-startTime)+" ms");
//									//		             	//		                             //
		
	 startTime=System.currentTimeMillis();
	Vector<Integer> v=new Vector<>();
	for(int i=0;i<10000000;++i) {
		v.add(i);
	}
	 endTime=System.currentTimeMillis();
	System.out.println("The diference in Vector "+(endTime-startTime)+" ms");
	}
}
