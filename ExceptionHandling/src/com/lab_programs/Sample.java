package com.lab_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample {	
	public  void m1() throws FileNotFoundException {
		File f=new File("F:/core_prg/SwapNum.java");
		FileReader fr=new FileReader(f);	
		System.out.println(f.exists());
	}
	public static void main(String[] args) {
		m2();
	}
	public static void m2() {
		
		Sample s=new Sample();
		//s.m1();//checked exceptions must handle
		try{
			s.m1();
		}catch(Exception e) {
			System.out.println("Check the file location");
		}
		
	}

}
