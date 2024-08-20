package com._3way;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for "+i);
			arr[i]=sc.nextInt();
		}
		int result[]=Program1.returnType(arr);
		System.out.println(Arrays.toString(result));
	}
public static int[] returnType(int arr[]) {
	int sum=arr[0];
	int sub=arr[0];
	int mul=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		sub=sub-arr[i];
		mul=mul*arr[i];
		}
	return new int[] {sum,sub,mul};	
	}
}