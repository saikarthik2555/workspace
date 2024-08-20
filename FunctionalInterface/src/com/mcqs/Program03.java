package com.mcqs;

interface Str{
	public abstract int methodStr(String str);
}

public class Program03 {
	public static void main(String[] args) {
		Str si= s ->s.length();
		System.out.println(si.methodStr("Karthik"));
	}

}
