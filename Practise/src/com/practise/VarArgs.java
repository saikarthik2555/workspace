package com.practise;

public class VarArgs {
	//variable argument--> 1.5
	
	public void add(int a,int ...x) {
		int sum=0;
		System.out.println(a);
		for(int y : x) {
			sum+=y;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		VarArgs a=new VarArgs();
	
		a.add(12,34,56,78);
	}

}
