package com.string_programs;

public class RemoveSpecificCharacter {
	public static void main(String[] args) {
		String name="TimeToPCCCrogress";
		byte []bytes=name.getBytes();
		byte []brr=new byte[bytes.length];
		int i,j,k;
		int l=name.length();
		for(i=0;i<l;i++) {
			if(bytes[i]==67) {
				for(j=i;j<l-1;j++) {
					brr[j]=bytes[j+1];
				}
				i--;
			}
		}
		for(i=0;i<brr.length;i++) {
			System.out.print((char)brr[i]+" ");
		}
	}

}
