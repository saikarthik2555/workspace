package com.string_programs;

public class ForLoop {
	public static void main(String[] args) {
		String str="Naresh I Technologies";
		int i,j;
//		for(i=0;i<str.length();i++) {
//			for(j=i+1;j<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//				System.out.println((int)str.charAt(j)+" "+str.charAt(j));	
//				}
//				
//			}
//		byte []bytes=str.getBytes();
//		System.out.println(bytes.length);
//		for(i=0;i<bytes.length;i++) {
//			for(j=i+1;j<bytes.length;j++) {
//				System.out.println(bytes[i]);
//			}	
//		}
		int arr[]= {1,2,3,4,5,6};
		System.out.println(arr.length);
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
		}
	}

}
