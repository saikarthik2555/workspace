package com.general_sorting;

import java.util.Arrays;

public class GeneralSort {
	public static void main(String[] args) {
		int temp;
		int arr[]= {23,45,12,76,90};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		}
	}
