package com._1way;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements :"+i);
			arr[i]=sc.nextInt();
		}
			System.out.print(Arrays.toString(arr));//Arrays to String 
	}
}
