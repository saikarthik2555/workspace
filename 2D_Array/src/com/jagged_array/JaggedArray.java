package com.jagged_array;

import java.util.Arrays;

public class JaggedArray {
	public static void main(String[] args) {
		int [][]marks=new int[4][];//class,students
		marks[0]=new int[7];	//1st class
		marks[1]=new int[4];
		marks[2]=new int[5];
		marks[3]=getValues();
				
		for(int i=0;i<marks[0].length;i++) {
			marks[0][i]=i;
		}
		for(int i=0;i<marks[1].length;i++) {
			marks[1][i]=i;
		}
		for(int i=0;i<marks[2].length;i++) {
			marks[2][i]=i;
		}
	System.out.println(Arrays.toString(marks[0]));	
	System.out.println(Arrays.toString(marks[1]));
	System.out.println(Arrays.toString(marks[2]));
	System.out.println(Arrays.toString(marks[3]));
	
	//Class name from Object
	Class c=marks.getClass();
	System.out.println(c.getName());
	
	//From Arrays Override
	Arrays.fill(marks[0], 0, 4, 8);
	System.out.println(Arrays.toString(marks[0]));
	}
	public static  int[] getValues() {
		return new int[] {9,9,9,9};
	}
}
