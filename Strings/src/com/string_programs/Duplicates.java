package com.string_programs;

public class Duplicates {
	public static void main(String[] args) {
		int visited=-1,i,j;
		String name="HELOO INDIAA";
		byte []bytes=name.getBytes();
		byte[] arr=bytes;
		int brr[]=new int[arr.length];
		for(i=0;i<arr.length-1;i++) {
			int count=1;
		for(j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				brr[j]=visited;
			}
		}
		if(brr[i]!=visited) {
			brr[i]=count;
		}
		}
		for(i=0;i<brr.length;i++)
		{
			if(brr[i]!=visited) {
				if(brr[i]>=2) {
				System.out.println((char)arr[i]+"     "+brr[i]);
				}
				}
		}
	}

}
