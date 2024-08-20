package com.string_methods;

import java.util.Arrays;

public class Anagram {
    public static final int count = 256;

    public static void main(String[] args) {
        String str1 = "saikarthik";
        String str2 = "karthiksai";
        System.out.println(checkAnagram(str1, str2));
    }

    public static boolean checkAnagram(String str1, String str2) {
    	if(str1.length()!=str2.length()) {
    		return false;
    	}
    	char c1[]=str1.toCharArray();
    	char c2[]=str2.toCharArray();
    	
    	int arr1[]=new int[count];
    	int arr2[]=new int[count];
    	Arrays.fill(arr1, 0);
    	Arrays.fill(arr2, 0);
    	
    	for(int i=0;i<c1.length;++i) {
    		arr1[c1[i]]++;
    		arr2[c2[i]]++;
    		System.out.print(c1[i]+"	"+(int)c1[i]+"	"+c2[i]+"	"+(int)c2[i]);
    		System.out.println();
    		System.out.print(i+"	"+arr1[c1[i]]+"	"+arr2[c2[i]]);
    		System.out.println();
    	}
    	
    	for(int i=0;i<count;++i) {
    		if(arr1[i]!=arr2[i]) {
    			return false;
    		}
    		System.out.print(i+"   "+arr1[i]+"     "+arr1[i]);
    		System.out.println();
    	}

    	return true;
    }
}
