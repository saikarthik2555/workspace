package com.string_programs;

public class DeleteDuplicates {
	public static void main(String[] args) {
		String str=new String("Hydderrabad");
		char c[]=str.toCharArray();
		int i,j;
		char ele='d';
		int n=c.length;
		
		
		for(i=0;i<n;i++) {
			if(c[i]==ele) {
				for(n--,j=i;j<n-1;j++) {
					c[j]=c[j+1];
				}
		i--;
				}		
	}
		
		for(i=0;i<n;i++) {
			System.out.print((char)c[i]);
		}
	}

}
