package com.string_programs;

public class Frequency {
	public static void main(String[] args) {
		String s="Hello Everyone";
				int i,j;
		char visited='@';
		char c[]=s.toCharArray();
		char ch[]=new char[c.length];
		for(i=0;i<c.length-1;i++) {
			char count=49;
			for(j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					ch[j]=visited;
				}
			}
			if(ch[i]!=visited) {
				ch[i]=count;
			}
		}
		for(i=0;i<ch.length;i++) {
			if(ch[i]!=visited) {
				System.out.println(c[i]+"     |      "+ch[i]);
			}
		}
	
	}

}
