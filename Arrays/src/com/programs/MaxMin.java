package com.programs;

public class MaxMin {
	public static void main(String[] args) {
	int arr[]= {12,34,56,-1,2,34,-21,33,54,-0};
	int max=-9,min=9,i;
	int arr1[]= {'a'/'b',1*8,3-56,'s'*'e'}; 
	//int max=arr[0];int min=arr[0],i;
	for(i=0;i<10;i++) {
		if(min>arr[i]) { min=arr[i]; }
		if(max<arr[i]) { max=arr[i]; }
	}
	System.out.println("Max = "+max+" Min = "+min);
	}
}
