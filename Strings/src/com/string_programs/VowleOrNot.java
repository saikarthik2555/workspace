package com.string_programs;

public class VowleOrNot {
public static void main(String[] args) {
	String name="TheScore";
	name=name.toLowerCase();
	byte []bytes=name.getBytes();
	int i;
	for(i=0;i<name.length();i++) {
		if(bytes[i]==97 || bytes[i]==101 || bytes[i]==105 ||bytes[i]==111 || bytes[i]==117) {
System.out.println((char)bytes[i]+"- Vowel");			
		}
		else {
			System.out.println((char)bytes[i]+"- Consonant");
		}
	}
}
}
