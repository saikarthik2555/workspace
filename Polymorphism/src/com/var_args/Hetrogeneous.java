package com.var_args;

public class Hetrogeneous {
	public void hetrogeneous(Object... x) {
		String sum=null;
		for(Object y:x) {
			sum+=y;
		}
		System.out.println(sum);
	}

}
