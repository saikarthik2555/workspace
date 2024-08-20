package com.string_programs;

public class ReverseAsciCharacters {
	public static void main(String[] args) {
		String name="aabbAa"; int i,j,t;
		byte []bytes=name.getBytes();
		for(i=0;i<name.length();i++) {
			System.out.print(bytes[i]+" ");
		}
		for(i=0;i<name.length()-2;i++) {
			for(j=i+1;j<name.length();j++) {
			if(bytes[i]>bytes[j]) {
				t=bytes[i];
				bytes[i]=bytes[j];
				bytes[j]=(byte) t;
			}
			}
		}
		System.out.println("\nAfter selection Sorting");
		for(i=0;i<bytes.length;i++) {
			System.out.print((char)bytes[i]);
		}
		
	}

}
