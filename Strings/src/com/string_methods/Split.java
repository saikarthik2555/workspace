package com.string_methods;

import java.util.Arrays;

//reprsent even number Strings
public class Split {
	public static void main(String[] args) {
		String str="I am practicing String methods";
		new Split().printWordss(str);
	}
	
	public void printWordss(String str) {
		String words[]=str.split(" ");
		System.out.println(Arrays.deepToString(words));
		int[] wordslength=new int[words.length];
		for(int i=0;i<words.length;++i) {
			wordslength[i]=words[i].length();
		}
		for(int w:wordslength) {
			System.out.println(w);
		}
	}
	
	public void printWords(String str) {
		
		String words[]=str.split(" ");
		for(String word: words) {
			if(word.length()%2==0) {
				System.out.println(word+" ");
			}
		}
	}
}
