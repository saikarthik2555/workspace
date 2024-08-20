package com.var_args;

public class AddParameters {
	public void acceptData(int z,int ...x) {
		System.out.println("1st value of the row"+z);
		int sum=0;
		int row=1;
		for(int y:x) {
			sum+=y;
		}
		System.out.println(row +" row sum:"+ sum);
	}

}
