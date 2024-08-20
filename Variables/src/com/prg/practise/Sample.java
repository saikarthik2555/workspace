package com.prg.practise;

public class Sample {
	
	static void m1(int p) {
		int q=10;
		if(p==q) {
			int r=120;
			System.out.println(r);
		}
	//	System.out.println(r);			//Error becuase it is in if block
	}
	public static void main(String[] args) {
		m1(10);
	}

}
